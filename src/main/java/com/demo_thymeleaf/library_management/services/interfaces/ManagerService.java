package com.demo_thymeleaf.library_management.services.interfaces;

import com.demo_thymeleaf.library_management.entities.Manager;
import java.util.List;

public interface ManagerService extends BaseService<Manager, Long> {
    List<Manager> findByLibraryId(Long libraryId);
}
