package com.keerthy.example.messaging.exception;

import org.springframework.http.HttpStatus;

public class MsgWriteProcessException extends RuntimeException {

    private String message;
    private HttpStatus httpStatus;

    public MsgWriteProcessException(String message, String message1, HttpStatus httpStatus) {
        this.message = message1;
        this.httpStatus = httpStatus;
    }


    public MsgWriteProcessException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
