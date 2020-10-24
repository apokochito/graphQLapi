package com.spring.graphql.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.services.BooksServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class BookMutation implements GraphQLMutationResolver {

    private BooksServiceImpl booksService;

    public BookMutation(BooksServiceImpl booksService) {
        this.booksService = booksService;
    }

    public void addBook(String title, String author) {
        this.booksService.addBook(title, author);
    }
}
