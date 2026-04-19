package com.project.back_end.services;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    public String bookAppointment() {
        return "Appointment booked";
    }
}
