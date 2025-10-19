package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, Long> {
    Optional<Membership> findByTypeIgnoreCase(String type);
}
