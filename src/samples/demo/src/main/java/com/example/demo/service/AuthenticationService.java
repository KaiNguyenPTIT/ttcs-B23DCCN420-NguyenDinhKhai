package com.example.demo.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.dto.request.AuthenticationRequest;
import com.example.demo.dto.request.IntrospecRequest;
import com.example.demo.dto.response.AuthenticationResponse;
import com.example.demo.dto.response.IntrospectResponse;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

@Service
public class AuthenticationService {
    
    @Autowired
    private UserRepository userRepository;

    public static final String SIGNER_KEY = "1234567890123456789012345678901212345678901234567890123456789012";

    // Xác thực một token
    public IntrospectResponse introspect(IntrospecRequest request) {
        try {
            String token = request.getToken();
            JWSVerifier verifier = new MACVerifier(SIGNER_KEY.getBytes());
            SignedJWT signedJWT = SignedJWT.parse(token);

            boolean verified = signedJWT.verify(verifier);
            Date expiryTime = signedJWT.getJWTClaimsSet().getExpirationTime();

            return new IntrospectResponse(verified && expiryTime.after(new Date()));
        } catch (Exception e) {
            return new IntrospectResponse(false);
    }
}

    // Kiểm tra user có trong hệ thống chưa để tạo token
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User không tồn tại!"));
        boolean authenticated = user.getPassword().equals(request.getPassword());
        if(!authenticated) {
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY,"Unauthenticated!");
        }
        
        String token =  generateToken(user);
        return new AuthenticationResponse(token, true);
    }

    // Tạo và ký một token
    public String generateToken(User user) {
        JWSHeader header = new JWSHeader(JWSAlgorithm.HS512);
        JWTClaimsSet jwtClaimsSet = new JWTClaimsSet.Builder()
                .subject(user.getUsername())
                .issuer("demo")
                .issueTime(new Date())
                .expirationTime(new Date(
                    Instant.now().plus(1, ChronoUnit.HOURS).toEpochMilli()
                ))
                .claim("scope", user.getRole())
                .build();

        Payload payload = new Payload(jwtClaimsSet.toJSONObject());
        JWSObject jwsObject = new JWSObject(header, payload);

        try {
            jwsObject.sign(new MACSigner(SIGNER_KEY.getBytes()));
            return jwsObject.serialize();
        } catch (JOSEException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Không tạo được token");
        }
    }
}
