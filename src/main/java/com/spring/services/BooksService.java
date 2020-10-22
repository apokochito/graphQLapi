package com.spring.services;

import com.spring.models.Book;

import java.util.List;
import java.util.Optional;

public interface BooksService {

    List<Book> getBooks();

    Optional<Book> getBooById(String id);

    void createBook(String title, String author);

}
