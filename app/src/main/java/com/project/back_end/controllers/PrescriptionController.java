package com.project.back_end.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping("/{token}")
    public ResponseEntity<String> savePrescription(
            @PathVariable String token,
            @Valid @RequestBody String prescription
    ) {

        // Dummy token validation
        if (token == null || token.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid token");
        }

        return ResponseEntity.ok("Prescription saved: " + prescription);
    }
}
