package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.Library;
import com.demo_thymeleaf.library_management.repositories.LibraryRepository;
import com.demo_thymeleaf.library_management.services.interfaces.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;

    @Override
    public List<Library> findAll() {
        return libraryRepository.findAll();
    }

    @Override
    public Optional<Library> findById(Long id) {
        return libraryRepository.findById(id);
    }

    @Override
    public Library save(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public void deleteById(Long id) {
        libraryRepository.deleteById(id);
    }
}
