package com.fly.demo.model;

import java.time.LocalDateTime;

public class  Message {
    private String author;
    private LocalDateTime timeis;
    private String message;

    public Message(){

    }
    public Message(String author, String message) {
        this.timeis = LocalDateTime.now();
        this.author = author;
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getTimeis() {
        return timeis;
    }

    public void setTimeis(LocalDateTime timeis) {
        this.timeis = timeis;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
