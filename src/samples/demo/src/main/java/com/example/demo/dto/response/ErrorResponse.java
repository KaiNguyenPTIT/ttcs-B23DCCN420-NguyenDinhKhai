package com.example.demo.dto.response;

public class ErrorResponse {

    private int status;
    private String message;

    public ErrorResponse() {}
    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    //Getter
    public int getStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }

    //Setter
    public void setStatus(int status) {
        this.status = status;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
