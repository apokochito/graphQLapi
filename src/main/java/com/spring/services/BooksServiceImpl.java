package com.spring.services;

import com.spring.models.Book;
import com.spring.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl {

    @Autowired
    private BooksRepository booksRepository;

    public List<Book> getBooks() {
        return this.booksRepository.findAll();
    }

    public Book getBookById(String id) {
        return this.booksRepository.findBookBy_id(id);
    }

    public void addBook(String title, String author) {
        System.out.println(title);
        System.out.println(author);
    }
}
