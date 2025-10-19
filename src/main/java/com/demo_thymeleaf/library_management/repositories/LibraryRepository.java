package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
    Optional<Library> findByNameIgnoreCase(String name);
}
