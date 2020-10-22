package com.graphql.spring.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "book")
public class Book {

    private String _id;
    private String title;
    private String author;
}
