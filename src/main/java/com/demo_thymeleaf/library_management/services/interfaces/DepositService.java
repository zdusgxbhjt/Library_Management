package com.demo_thymeleaf.library_management.services.interfaces;

import com.demo_thymeleaf.library_management.entities.Deposit;
import java.util.List;

public interface DepositService extends BaseService<Deposit, Long> {
    List<Deposit> findByUserId(Long userId);
}
