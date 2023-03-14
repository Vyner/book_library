package org.example.service;

import org.example.dao.BookRepository;
import org.example.model.BookInfo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String store(BookInfo bookInfo) {
        String uuid = UUID.randomUUID().toString();
        bookInfo.setId(uuid);

        bookRepository.save(bookInfo);

        return uuid;
    }
}
