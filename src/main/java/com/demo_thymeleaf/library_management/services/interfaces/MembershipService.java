package com.demo_thymeleaf.library_management.services.interfaces;

import com.demo_thymeleaf.library_management.entities.Membership;

public interface MembershipService extends BaseService<Membership, Long> {
    Membership findByTypeIgnoreCase(String type);
}
