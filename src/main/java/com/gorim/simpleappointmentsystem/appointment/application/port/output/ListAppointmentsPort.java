package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment.AppointmentEntity;
import reactor.core.publisher.Flux;

public interface  ListAppointmentsPort {
    Flux<AppointmentEntity> list();
}
