package com.gorim.simpleappointmentsystem.appointment.application.port.input;

import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import reactor.core.publisher.Mono;

public interface CreateAppointmentUseCase {

    Mono<Appointment> createAppointment(CreateAppointmentCommand command);

}
