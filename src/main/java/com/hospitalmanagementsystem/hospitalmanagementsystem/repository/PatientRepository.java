package com.hospitalmanagementsystem.hospitalmanagementsystem.repository;

import com.hospitalmanagementsystem.hospitalmanagementsystem.dto.GenderPatientCount;
import com.hospitalmanagementsystem.hospitalmanagementsystem.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {
    Patient findByName(String name);
//    Patient findByName(String name);
//    Patient findByBirthDate(String name);

    List<Patient> findByBirthdateBetween(LocalDate d1, LocalDate d2);

    @Query("Select p from Patient p where p.birthdate > ?1")
    List<Patient> findBornAfter(@Param("birthdate")LocalDate d1);

@Query("select new com.hospitalmanagementsystem.hospitalmanagementsystem.dto.GenderPatientCount(p.gender,count(p)) from Patient p group by p.gender")
    List<GenderPatientCount> findGenderCountPatient();


// find all patient
    @Query(value = "select * from patient" , nativeQuery = true)
    Page<Patient> getAllPatient(Pageable pageable);
}
