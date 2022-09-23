package com.gorim.simpleappointmentsystem.appointment.application;

import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentUseCase;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import com.gorim.simpleappointmentsystem.appointment.domain.Client;
import com.gorim.simpleappointmentsystem.appointment.domain.Professional;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.SearchAppointmentPort;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.CreateAppointmentPort;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.LoadClientPort;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.LoadProfessionalPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
@Component
@Transactional
public class CreateAppointmentService implements CreateAppointmentUseCase {

    private final LoadProfessionalPort loadProfessionalPort;
    private final LoadClientPort loadClientPort;
    private final CreateAppointmentPort createAppointmentPort;
    private final SearchAppointmentPort searchAppointmentPort;

    @Override
    public Optional<Appointment> createAppointment(CreateAppointmentCommand command) {
        final Professional professional = loadProfessionalPort.loadProfessional(command.getProfessionalId());
        final Client client = loadClientPort.loadClient(command.getClientId());

        Objects.requireNonNull(client);
        Objects.requireNonNull(professional);

        searchAppointmentPort.checkProfessionalAppointmentExists(command.getDateTime(), command.getProfessionalId());
        searchAppointmentPort.checkClientAppointmentExists(command.getDateTime(), command.getClientId());

        final Appointment appointment = new Appointment(command.getTitle(), command.getProfessionalId(), command.getClientId(), command.getDateTime());

        createAppointmentPort.create(appointment);

        return Optional.of(appointment);
    }


}
