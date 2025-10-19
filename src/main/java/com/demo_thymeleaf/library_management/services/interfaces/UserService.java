package com.demo_thymeleaf.library_management.services.interfaces;

import com.demo_thymeleaf.library_management.entities.User;
import java.util.List;

public interface UserService extends BaseService<User, Long> {
    User findByEmail(String email);

    List<User> findBannedUsers();
}
