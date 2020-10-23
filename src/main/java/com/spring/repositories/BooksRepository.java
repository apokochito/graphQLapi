package com.spring.repositories;

import com.spring.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<Book, String> {
    public Book findBookBy_id(String id);
}
