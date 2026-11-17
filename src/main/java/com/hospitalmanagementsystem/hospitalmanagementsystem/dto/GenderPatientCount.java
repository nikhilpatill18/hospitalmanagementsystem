package com.hospitalmanagementsystem.hospitalmanagementsystem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenderPatientCount {

    private String gender;
    private long count;
}
