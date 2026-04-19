package com.project.back_end.services;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    public String bookAppointment(String patient) {
        return "Appointment booked for " + patient;
    }

    public String getAppointments() {
        return "Appointments retrieved";
    }
}
