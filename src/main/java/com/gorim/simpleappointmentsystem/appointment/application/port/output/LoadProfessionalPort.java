package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.domain.Professional;

public interface LoadProfessionalPort {
    Professional loadProfessional(String professionalId);

}
