package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);

    List<Book> findByAvailableTrue();

    List<Book> findByTitleContainingIgnoreCase(String title);
}
