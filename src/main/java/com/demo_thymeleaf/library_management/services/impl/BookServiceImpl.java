package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.Book;
import com.demo_thymeleaf.library_management.exceptions.ResourceNotFoundException;
import com.demo_thymeleaf.library_management.repositories.BookRepository;
import com.demo_thymeleaf.library_management.services.interfaces.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn).orElseThrow(() -> new ResourceNotFoundException("Book not found with ISBN: " + isbn) );
    }

    @Override
    public List<Book> findAvailableBooks() {
        return bookRepository.findAll()
                .stream()
                .filter(Book::isAvailable)
                .toList();
    }
}
