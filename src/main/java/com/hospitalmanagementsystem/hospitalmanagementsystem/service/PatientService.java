package com.hospitalmanagementsystem.hospitalmanagementsystem.service;

import com.hospitalmanagementsystem.hospitalmanagementsystem.entity.Patient;
import com.hospitalmanagementsystem.hospitalmanagementsystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientReposiotry;

    @Transactional
    public Patient getPatientById(UUID id){
        Patient p1=patientReposiotry.findById(id).orElseThrow();

        Patient p2=patientReposiotry.findById(id).orElseThrow();

        return p1;
    }


}
