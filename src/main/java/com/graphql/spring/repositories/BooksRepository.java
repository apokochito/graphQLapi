package com.graphql.spring.repositories;

import com.graphql.spring.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Book, String> {
}
