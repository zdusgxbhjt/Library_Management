package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
    List<Manager> findByLibraryId(Long libraryId);

    Optional<Manager> findByEmailIgnoreCase(String email);
}
