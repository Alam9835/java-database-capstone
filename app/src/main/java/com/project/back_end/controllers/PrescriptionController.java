package com.project.back_end.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping
    public String savePrescription(@RequestBody String prescription) {
        return "Prescription saved: " + prescription;
    }
}
