package com.demo_thymeleaf.library_management.services.interfaces;

import com.demo_thymeleaf.library_management.entities.Book;
import java.util.List;

public interface BookService extends BaseService<Book, Long> {
    Book findByIsbn(String isbn);

    List<Book> findAvailableBooks();
}
