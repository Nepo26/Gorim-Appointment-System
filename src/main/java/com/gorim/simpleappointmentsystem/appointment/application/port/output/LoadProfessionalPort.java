package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.domain.Professional;
import com.gorim.simpleappointmentsystem.appointment.domain.Professional.ProfessionalId;

public interface LoadProfessionalPort {
    Professional loadProfessional(ProfessionalId professionalId);

}
