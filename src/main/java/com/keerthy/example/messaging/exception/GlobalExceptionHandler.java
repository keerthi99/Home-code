package com.keerthy.example.messaging.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NewMsgWriteException.class)
    public ResponseEntity writeNewMessageException(Exception ex){
        NewMsgWriteException newMsgWriteException = new NewMsgWriteException(ex.getMessage(), HttpStatus.NOT_FOUND);
       return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());

    }

    @ExceptionHandler(value = MsgWriteProcessException.class)
        public ResponseEntity messageWriteProcessException(Exception ex){
        NewMsgWriteException newMsgWriteException = new NewMsgWriteException(ex.getMessage(), HttpStatus.NOT_FOUND);
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}

