package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.User;
import com.demo_thymeleaf.library_management.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailIgnoreCase(String email);

    List<User> findByBannedTrue();

    List<User> findByMembership(Membership membership);
}
