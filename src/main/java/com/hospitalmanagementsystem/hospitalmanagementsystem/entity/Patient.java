package com.hospitalmanagementsystem.hospitalmanagementsystem.entity;


import com.hospitalmanagementsystem.hospitalmanagementsystem.entity.types.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@ToString
@Getter
@Setter
@Table(
        name="patient",
        uniqueConstraints = {
                @UniqueConstraint(name = "patient_unique_email", columnNames = {"email"})

        }
        ,
        indexes = {
                @Index(name="idx_patient_birthdate",columnList ="birthdate" )
        }
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @ToString.Exclude
    private LocalDate birthdate;

    private String email;

    private String gender;

    @Enumerated
    private BloodGroupType bloodgroup;

//    @CreationTimestamp
//    private LocalDateTime createdAt;

    @OneToOne  // owner side
    private Insurance insurance;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointment;


}
