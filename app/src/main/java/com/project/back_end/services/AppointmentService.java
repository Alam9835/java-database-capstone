package com.project.back_end.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    // Dummy in-memory list (acts like repository)
    private List<String> appointments = new ArrayList<>();

    // Book appointment (simulate saving)
    public String bookAppointment(Long doctorId, String date) {
        String appointment = "DoctorId: " + doctorId + ", Date: " + date;
        appointments.add(appointment);
        return "Appointment booked successfully: " + appointment;
    }

    // Retrieve appointments by doctor and date
    public List<String> getAppointmentsByDoctorAndDate(Long doctorId, String date) {
        List<String> result = new ArrayList<>();

        for (String appt : appointments) {
            if (appt.contains("DoctorId: " + doctorId) && appt.contains(date)) {
                result.add(appt);
            }
        }

        return result;
    }
}
