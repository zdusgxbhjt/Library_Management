package com.demo_thymeleaf.library_management.repositories;

import com.demo_thymeleaf.library_management.entities.Deposit;
import com.demo_thymeleaf.library_management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepositRepository extends JpaRepository<Deposit, Long> {
    List<Deposit> findByUserOrderByTimestampDesc(User user);

    List<Deposit> findByUserId(Long userId);
}
