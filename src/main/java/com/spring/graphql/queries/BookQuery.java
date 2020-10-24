package com.spring.graphql.queries;

import com.spring.models.Book;
import com.spring.services.BooksServiceImpl;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQuery implements GraphQLQueryResolver {

    private BooksServiceImpl booksService;

    public BookQuery(BooksServiceImpl booksService) {
        this.booksService = booksService;
    }

    public List<Book> getBooks() {
        return this.booksService.getBooks();
    }

    public Book getBookById(String id) {
        return this.booksService.getBookById(id);
    }

    public String hello() {
        System.out.println("En el BookQueryyyyyy");
        return "Hey";
    }
}
