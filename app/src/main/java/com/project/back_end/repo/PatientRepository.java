package com.project.back_end.repo;

import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository {

    default String findPatientById(Long id) {
        return "Patient with ID: " + id;
    }
}
