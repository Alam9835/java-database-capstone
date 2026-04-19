package com.project.back_end.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @GetMapping
    public String getDoctors() {
        return "Doctors list";
    }

    @GetMapping("/{id}")
    public String getDoctorById(@PathVariable Long id) {
        return "Doctor ID: " + id;
    }
}
