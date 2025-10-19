package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.Manager;
import com.demo_thymeleaf.library_management.repositories.ManagerRepository;
import com.demo_thymeleaf.library_management.services.interfaces.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    @Override
    public Optional<Manager> findById(Long id) {
        return managerRepository.findById(id);
    }

    @Override
    public Manager save(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public void deleteById(Long id) {
        managerRepository.deleteById(id);
    }

    @Override
    public List<Manager> findByLibraryId(Long libraryId) {
        return managerRepository.findByLibraryId(libraryId);
    }
}
