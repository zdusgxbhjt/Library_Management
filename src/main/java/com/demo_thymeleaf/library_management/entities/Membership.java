package com.demo_thymeleaf.library_management.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "memberships")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String type; // Ordinary / Advance / Premium

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int monthlyLimit; // 0 = unlimited
}
