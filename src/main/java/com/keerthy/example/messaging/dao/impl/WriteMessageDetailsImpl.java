package com.keerthy.example.messaging.dao.impl;


import com.keerthy.example.messaging.dao.WriteMessageDetails;
import com.keerthy.example.messaging.exception.MsgWriteProcessException;
import com.keerthy.example.messaging.exception.NewMsgWriteException;
import com.keerthy.example.messaging.model.MessageResp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Component
public class WriteMessageDetailsImpl implements WriteMessageDetails {
    @Value("${input.fileName}")
    private String fileName;

    @Override
    public void writeMessageAsHash(Integer id, String text, String userName, String expireDate) {

        Map<Integer, MessageResp> messageAsMap = new HashMap<>();
        MessageResp messageResp = new MessageResp();
        messageResp.setUserName(userName);
        messageResp.setText(text);
        messageResp.setExpireDate(expireDate);

        messageAsMap.put(id, messageResp);

        try (BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(fileOut)){
                outputStream.writeObject(messageAsMap);
            }
            } catch (FileNotFoundException e) {
            throw  new NewMsgWriteException(e);
        } catch (IOException e) {
            throw new MsgWriteProcessException(e);
        }

    }
}
