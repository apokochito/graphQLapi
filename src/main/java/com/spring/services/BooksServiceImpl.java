package com.spring.services;

import com.spring.models.Book;
import com.spring.repositories.BooksRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService {

    private BooksRepository booksRepository;

    public BooksServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    /*
    - THIS RESUMES -
    UserTransaction utx = entityManager.getTransaction();

    try {
        utx.begin();
        businessLogic();
        utx.commit();
    } catch(Exception ex) {
        utx.rollback();
        throw ex;
    }
    - TO -
    @Transactional
     */

    @Transactional(readOnly = true)
    public List<Book> getBooks() {
        return this.booksRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Book> getBooById(String id) {
        return this.booksRepository.findById(id);
    }

    @Transactional
    public void createBook(String title, String author) {
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        this.booksRepository.save(book);
    }
}
