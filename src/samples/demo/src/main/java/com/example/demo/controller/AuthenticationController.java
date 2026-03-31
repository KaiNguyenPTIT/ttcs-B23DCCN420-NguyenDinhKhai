package com.example.demo.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.AuthenticationRequest;
import com.example.demo.dto.request.IntrospecRequest;
import com.example.demo.dto.response.AuthenticationResponse;
import com.example.demo.dto.response.IntrospectResponse;
import com.example.demo.service.AuthenticationService;
import com.nimbusds.jose.JOSEException;

@RestController
public class AuthenticationController {
    
    @Autowired
    private AuthenticationService authenticationService; 
    
    @PostMapping("/token")
    AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {
        return authenticationService.authenticate(request);
    }

    @PostMapping("/introspect")
    IntrospectResponse authenticate(@RequestBody IntrospecRequest request) throws JOSEException, ParseException{
        return authenticationService.introspect(request);
    }
}
