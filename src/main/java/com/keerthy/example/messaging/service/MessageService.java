package com.keerthy.example.messaging.service;

import com.keerthy.example.messaging.model.MessagePostResp;
import com.keerthy.example.messaging.model.MessageRequest;

public interface MessageService {

    MessagePostResp newMsgResp(MessageRequest messageRequest);
}
