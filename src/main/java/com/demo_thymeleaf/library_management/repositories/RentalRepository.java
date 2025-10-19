package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Rental;
import com.demo_thymeleaf.library_management.entities.User;
import com.demo_thymeleaf.library_management.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
    List<Rental> findByUser(User user);

    List<Rental> findByBook(Book book);

    List<Rental> findByReturnDateIsNull(); // currently borrowed

    List<Rental> findByDueDateBeforeAndReturnDateIsNull(LocalDate today); // overdue
}
