package org.example.model;

public class BookInfo {

    private String id;

    private String name;
    private long price;

    private String author;

    public BookInfo(String id, String name, long price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public BookInfo(String name, long price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
