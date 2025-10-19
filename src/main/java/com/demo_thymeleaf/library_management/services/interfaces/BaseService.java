package com.demo_thymeleaf.library_management.services.interfaces;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T entity);

    void deleteById(ID id);
}