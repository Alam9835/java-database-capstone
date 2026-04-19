package com.project.back_end.repo;

import org.springframework.stereotype.Repository;
import com.project.back_end.models.Patient;

@Repository
public interface PatientRepository {

    // Find patient by email
    Patient findByEmail(String email);

    // Find patient by phone
    Patient findByPhone(String phone);

    // Find patient by email OR phone
    Patient findByEmailOrPhone(String email, String phone);
}
