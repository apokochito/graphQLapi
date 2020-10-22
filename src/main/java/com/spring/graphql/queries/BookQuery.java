package com.spring.graphql.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.models.Book;
import com.spring.services.BooksService;

import java.util.List;
import java.util.Optional;

public class BookQuery implements GraphQLQueryResolver {

    private BooksService booksService;

    public BookQuery(BooksService booksService) {
        this.booksService = booksService;
    }

    public List<Book> getBooks() {
        return this.booksService.getBooks();
    }

    public Optional<Book> getBook(String id) {
        return this.booksService.getBooById(id);
    }
}
