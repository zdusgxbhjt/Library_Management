package com.demo_thymeleaf.library_management.services.interfaces;

import com.demo_thymeleaf.library_management.entities.Rental;
import java.util.List;

public interface RentalService extends BaseService<Rental, Long> {
    List<Rental> findOverdueRentals();
}
