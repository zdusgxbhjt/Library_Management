package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.Rental;
import com.demo_thymeleaf.library_management.repositories.RentalRepository;
import com.demo_thymeleaf.library_management.services.interfaces.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalRepository rentalRepository;

    @Override
    public List<Rental> findAll() {
        return rentalRepository.findAll();
    }

    @Override
    public Optional<Rental> findById(Long id) {
        return rentalRepository.findById(id);
    }

    @Override
    public Rental save(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public void deleteById(Long id) {
        rentalRepository.deleteById(id);
    }

    @Override
    public List<Rental> findOverdueRentals() {
        return rentalRepository.findByDueDateBeforeAndReturnDateIsNull(LocalDate.now());
    }
}
