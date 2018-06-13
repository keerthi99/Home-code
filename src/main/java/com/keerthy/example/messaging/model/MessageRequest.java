package com.keerthy.example.messaging.model;

import java.io.Serializable;

public class MessageRequest implements Serializable {

    private static final long serialVersionUID = -44605304660578134L;

    private String userName;
    private String text;
    private Integer timeOut;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }
}
