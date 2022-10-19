package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment.AppointmentEntity;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import reactor.core.publisher.Mono;

public interface CreateAppointmentPort {
    Mono<AppointmentEntity> create(Appointment appointment);
}
