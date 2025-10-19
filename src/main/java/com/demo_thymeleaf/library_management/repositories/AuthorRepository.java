package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByFullNameContainingIgnoreCase(String name);
}
