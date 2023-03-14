package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_info")
public class BookInfo {

    @Id
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
