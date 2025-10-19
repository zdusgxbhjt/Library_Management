package com.demo_thymeleaf.library_management.services.impl;

import com.demo_thymeleaf.library_management.entities.Membership;
import com.demo_thymeleaf.library_management.exceptions.ResourceNotFoundException;
import com.demo_thymeleaf.library_management.repositories.MembershipRepository;
import com.demo_thymeleaf.library_management.services.interfaces.MembershipService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MembershipServiceImpl implements MembershipService {

    private final MembershipRepository membershipRepository;

    @Override
    public List<Membership> findAll() {
        return membershipRepository.findAll();
    }

    @Override
    public Optional<Membership> findById(Long id) {
        return membershipRepository.findById(id);
    }

    @Override
    public Membership save(Membership membership) {
        return membershipRepository.save(membership);
    }

    @Override
    public void deleteById(Long id) {
        membershipRepository.deleteById(id);
    }

    @Override
    public Membership findByTypeIgnoreCase(String type) {
        return membershipRepository.findByTypeIgnoreCase(type)
                .orElseThrow(() -> new ResourceNotFoundException("Membership not found with type: " + type));
    }
}
