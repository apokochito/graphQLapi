package com.spring.graphql.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.repositories.BooksRepository;
import org.springframework.stereotype.Component;

@Component
public class BookQuery implements GraphQLQueryResolver {

    private BooksRepository booksRepository;

    public BookQuery(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

}
