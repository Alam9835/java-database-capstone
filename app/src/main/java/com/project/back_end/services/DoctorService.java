package com.project.back_end.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    // Method to get available time slots
    public List<String> getAvailableSlots(Long doctorId, String date) {
        List<String> slots = new ArrayList<>();

        // Dummy data (simulating availability)
        slots.add("10:00 AM");
        slots.add("11:00 AM");
        slots.add("2:00 PM");

        return slots;
    }

    // Method to validate doctor login
    public boolean validateDoctorLogin(String email, String password) {
        // Dummy validation logic
        return email.equals("doctor@example.com") && password.equals("password123");
    }
}
