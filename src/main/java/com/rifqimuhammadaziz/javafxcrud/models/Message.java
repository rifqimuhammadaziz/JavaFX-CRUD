package com.rifqimuhammadaziz.javafxcrud.models;

import java.time.Instant;
import java.util.Date;

public class Message {
    private Date date;
    private String message;

    public Message(String message) {
        this.message = message;
        this.date = Date.from(Instant.now());
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + date +
                ", message='" + message + '\'' +
                '}';
    }
}
