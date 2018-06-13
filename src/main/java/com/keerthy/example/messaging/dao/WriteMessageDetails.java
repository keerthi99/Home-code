package com.keerthy.example.messaging.dao;

public interface WriteMessageDetails {

    void writeMessageAsHash(Integer id, String text, String userName,String expireDate );
}
