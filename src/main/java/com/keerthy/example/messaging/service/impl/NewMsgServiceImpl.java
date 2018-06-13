package com.keerthy.example.messaging.service.impl;

import com.keerthy.example.messaging.dao.WriteMessageDetails;
import com.keerthy.example.messaging.model.MessagePostResp;
import com.keerthy.example.messaging.model.MessageRequest;
import com.keerthy.example.messaging.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

@Service
public class NewMsgServiceImpl implements MessageService {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final Integer DEFAULT_TIMEOUT = 60;

    @Autowired
    private WriteMessageDetails writeMessageDetails;

    @Override
    public MessagePostResp newMsgResp(MessageRequest messageRequest) {

        Calendar calendar = Calendar.getInstance();

        if (messageRequest.getTimeOut() == null){
            calendar.add(Calendar.SECOND, DEFAULT_TIMEOUT);
        }else {
            calendar.add(Calendar.SECOND, messageRequest.getTimeOut());
        }

        String expireDate = SDF.format(calendar.getTime());

        Integer id = getRandomId();
        writeMessageDetails.writeMessageAsHash(id, messageRequest.getText(), messageRequest.getUserName(), expireDate);
        MessagePostResp postResp = new MessagePostResp();
        postResp.setId(id);

        return postResp;
    }


    private Integer getRandomId(){
        Random random = new Random();
        Integer id = random.nextInt(9999);
        return id;
    }


}
