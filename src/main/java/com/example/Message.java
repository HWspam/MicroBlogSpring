package com.example;

/**
 * Created by erikjakubowski on 12/20/16.
 */


public class Message {
    String id;
    String text;

    public Message (){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message(String id, String text) {
        this.id = id;
        this.text = text;
    }
}
