package com.keerthy.example.messaging.controller;


import com.keerthy.example.messaging.model.MessageRequest;
import com.keerthy.example.messaging.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messaging")
public class ResourceController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/chat",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity postMessage(@RequestBody(required = false) MessageRequest messageRequest){

        return response(messageService.newMsgResp(messageRequest), HttpStatus.CREATED);

    }

    private ResponseEntity response(Object object, HttpStatus status){
        return  ResponseEntity.status(status).body(object);
    }

}
