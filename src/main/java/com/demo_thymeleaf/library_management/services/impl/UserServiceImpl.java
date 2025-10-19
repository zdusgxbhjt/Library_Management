package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.User;
import com.demo_thymeleaf.library_management.exceptions.ResourceNotFoundException;
import com.demo_thymeleaf.library_management.repositories.UserRepository;
import com.demo_thymeleaf.library_management.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email).orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + email));
    }

    @Override
    public List<User> findBannedUsers() {
        return userRepository.findByBannedTrue();
    }
}
