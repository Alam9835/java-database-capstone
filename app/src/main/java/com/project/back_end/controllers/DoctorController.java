package com.project.back_end.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    // Existing basic endpoint
    @GetMapping
    public String getDoctors() {
        return "Doctors list";
    }

    // REQUIRED endpoint (as per assignment)
    @GetMapping("/availability/{role}/{doctorId}/{date}")
    public String getDoctorAvailability(
            @PathVariable String role,
            @PathVariable Long doctorId,
            @PathVariable String date,
            @RequestHeader("Authorization") String token
    ) {

        // Basic token validation (dummy logic)
        if (token == null || !token.startsWith("Bearer ")) {
            return "Invalid token";
        }

        // Role check (dummy)
        if (!role.equalsIgnoreCase("admin") && !role.equalsIgnoreCase("doctor")) {
            return "Access denied";
        }

        return "Doctor " + doctorId + " is available on " + date;
    }
}
