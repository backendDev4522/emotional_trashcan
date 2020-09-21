package com.trashcan.emotional.demo.common.model;

import javax.persistence.Embeddable;

@Embeddable
public class Attachments {

    //자원의 위치
    private String key;

    //자원의 이름
    private String name;

    //URL
    private String url;
}
