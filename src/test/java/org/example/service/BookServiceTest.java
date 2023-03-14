package org.example.service;

import org.example.dao.BookRepository;
import org.example.model.BookInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @InjectMocks
    BookService bookService;

    @Mock
    BookRepository bookRepository;

    @Test
    void store() {
        BookInfo bookInfo = new BookInfo("testBook", 1L, "testAuthor");

        Mockito.when(bookRepository.store(any(BookInfo.class)))
                .thenReturn(1L);

        Assertions.assertNotEquals(0, bookService.store(bookInfo).length());
    }
}