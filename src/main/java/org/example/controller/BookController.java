package org.example.controller;

import org.example.model.BookInfo;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    private final BookService bookService;

    @PostMapping("/store")
    String store(@RequestBody BookInfo bookInfo){
        return bookService.store(bookInfo);
    }

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
}
