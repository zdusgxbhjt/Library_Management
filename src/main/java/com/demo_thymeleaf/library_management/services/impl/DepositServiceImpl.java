package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.Deposit;
import com.demo_thymeleaf.library_management.repositories.DepositRepository;
import com.demo_thymeleaf.library_management.services.interfaces.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService {

    private final DepositRepository depositRepository;

    @Override
    public List<Deposit> findAll() {
        return depositRepository.findAll();
    }

    @Override
    public Optional<Deposit> findById(Long id) {
        return depositRepository.findById(id);
    }

    @Override
    public Deposit save(Deposit deposit) {
        return depositRepository.save(deposit);
    }

    @Override
    public void deleteById(Long id) {
        depositRepository.deleteById(id);
    }

    @Override
    public List<Deposit> findByUserId(Long userId) {
        return depositRepository.findByUserId(userId);
    }
}
