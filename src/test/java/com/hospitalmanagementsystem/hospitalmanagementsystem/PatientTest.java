package com.hospitalmanagementsystem.hospitalmanagementsystem;


import com.hospitalmanagementsystem.hospitalmanagementsystem.dto.GenderPatientCount;
import com.hospitalmanagementsystem.hospitalmanagementsystem.entity.Patient;
import com.hospitalmanagementsystem.hospitalmanagementsystem.repository.PatientRepository;
import com.hospitalmanagementsystem.hospitalmanagementsystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientrepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void patienttest(){
//        List<Patient> patient = patientrepository.findAll();
//
//        System.out.println(patient);
        Patient patient=patientrepository.findByName("name1");


    }

    @Test
    public void testPatient(){

//        UUID id=UUID.fromString("f96a4b73-3f97-4330-9bbe-acc0f481d3dd");
//        Patient patient=patientService.getPatientById(id);
//
//        System.out.println(patient);
        System.out.println("hello");

//        List<Patient> patients=patientrepository.findByBirthdateBetween(LocalDate.of(1990,01,01),LocalDate.of(2006,01,01));

//        List<Patient> patients=patientrepository.findBornAfter(LocalDate.of(1991,01,01));
//        for(Patient patient:patients){
//            System.out.println(patient);
//        }

//        List<GenderPatientCount> patients=patientrepository.findGenderCountPatient();
//
//        for(GenderPatientCount dt:patients){
//            System.out.println(dt);
//        }

        Page<Patient> patients =patientrepository.getAllPatient(PageRequest.of(0,1));

        for(Patient p:patients){
            System.out.println(p);
        }


    }
}
