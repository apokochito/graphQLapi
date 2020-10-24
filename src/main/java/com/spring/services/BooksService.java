package com.spring.services;

import com.spring.models.Book;

import java.util.List;

public interface BooksService {

    List<Book> getBooks();

    Book getBookById(String id);

    void addBook(String title, String author);
}
