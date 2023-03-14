package org.example.controller;


import org.example.model.BookInfo;
import org.example.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldReturnBookIdWhenStoreBookGivenBookInfo() throws Exception {
        String mockBookInfo = "{\n" +
                "   \"name\":\"testBook\",\n" +
                "   \"price\":\"10\",\n" +
                "   \"author\":\"testAuthor\"\n" +
                "}";

        Mockito.when(bookService.store(any(BookInfo.class))).thenReturn(1);

        MvcResult mvcResult = mockMvc.perform(post("/store")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mockBookInfo))
                .andExpect(status().isOk())
                .andReturn();
        Assertions.assertNotEquals(0, mvcResult.getResponse().getContentAsString().length());
    }

}
