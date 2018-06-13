package com.keerthy.example.messaging.model;


import java.io.Serializable;

public class MessagePostResp  implements Serializable {


    private static final long serialVersionUID = 7745019394010350306L;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
