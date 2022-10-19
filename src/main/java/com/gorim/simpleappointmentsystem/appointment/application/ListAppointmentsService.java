package com.gorim.simpleappointmentsystem.appointment.application;

import com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment.AppointmentMapper;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.ListAppointmentsUseCase;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.ListAppointmentsPort;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component
@Transactional
public class ListAppointmentsService implements ListAppointmentsUseCase {
    private final ListAppointmentsPort listAppointmentsPort;

    @Override
    public Flux<Appointment> listAppointments() {

        return listAppointmentsPort.list().log().map(AppointmentMapper::mapToDomain).log();
    }
}
