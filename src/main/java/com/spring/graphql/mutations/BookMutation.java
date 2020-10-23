package com.spring.graphql.mutations;

import com.spring.services.BooksServiceImpl;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutation implements GraphQLMutationResolver {

    @Autowired
    private BooksServiceImpl booksService;

    public void addBook(String title, String author) {
        this.booksService.addBook(title, author);
    }
}
