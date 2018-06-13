package com.keerthy.example.messaging.exception;

import org.springframework.http.HttpStatus;

public class NewMsgWriteException extends RuntimeException {

    private String message;

    private HttpStatus status;


    public NewMsgWriteException(Throwable cause) {
        super(cause);
    }

    public NewMsgWriteException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
