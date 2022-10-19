package com.gorim.simpleappointmentsystem.appointment.application.port.output;


import java.time.LocalDateTime;

public interface SearchAppointmentPort {
    boolean checkProfessionalAppointmentExists(LocalDateTime dateTime, String professionalId);
    boolean checkClientAppointmentExists(LocalDateTime dateTime, String clientId );
}
