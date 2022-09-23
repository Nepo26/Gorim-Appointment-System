package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.domain.Client.ClientId;
import com.gorim.simpleappointmentsystem.appointment.domain.Professional.ProfessionalId;

import java.time.LocalDateTime;

public interface SearchAppointmentPort {
    boolean checkProfessionalAppointmentExists(LocalDateTime dateTime, ProfessionalId professionalId);
    boolean checkClientAppointmentExists(LocalDateTime dateTime, ClientId clientId );
}
