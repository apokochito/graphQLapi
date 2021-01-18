package com.spring.graphql.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.spring.repositories.BooksRepository;
import org.springframework.stereotype.Component;

@Component
public class BookMutation implements GraphQLMutationResolver {

    private BooksRepository booksRepository;

    public BookMutation(BooksRepository booksRepository){this.booksRepository=booksRepository;}

    public void deleteBook(String id){
        booksRepository.deleteById(id);
    }

/*    public BookMutation(BooksServiceImpl booksService) {
        this.booksService = booksService;
    }

    public void addBook(String title, String author) {
        this.booksService.addBook(title, author);
    }
 */
}
