package com.keerthy.example.messaging.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class MessageResp implements Serializable {

    private static final long serialVersionUID = -7244804465906309943L;

    private String text;
    private String userName;
    private String expireDate;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
