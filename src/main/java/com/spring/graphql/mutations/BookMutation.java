package com.spring.graphql.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.services.BooksService;

public class BookMutation implements GraphQLMutationResolver {

    private BooksService booksService;

    public BookMutation(BooksService booksService) {
        this.booksService = booksService;
    }

    public void createBook(String title, String author) {
        this.booksService.createBook(title, author);
    }
}
