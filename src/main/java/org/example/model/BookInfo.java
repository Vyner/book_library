package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookInfo {

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("price")
    private long price;
    @JsonProperty("author")

    private String author;

    public BookInfo(String name, long price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
