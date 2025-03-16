package com.pm.patientservice.service;

import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}

