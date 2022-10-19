package com.gorim.simpleappointmentsystem.appointment.application.port.input;

import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import reactor.core.publisher.Flux;

public interface ListAppointmentsUseCase {
    Flux<Appointment> listAppointments();
}
