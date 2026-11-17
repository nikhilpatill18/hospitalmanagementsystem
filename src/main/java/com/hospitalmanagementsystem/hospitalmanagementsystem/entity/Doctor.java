package com.hospitalmanagementsystem.hospitalmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String speicalization;

    @Column(nullable = false,unique = true)
    private String email;

    @OneToMany(mappedBy = "doctor s")
    private List<Appointment> appointment;
}
