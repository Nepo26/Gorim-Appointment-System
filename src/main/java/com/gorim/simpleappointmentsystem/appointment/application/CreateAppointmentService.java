package com.gorim.simpleappointmentsystem.appointment.application;

import com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment.AppointmentMapper;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentCommand;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentUseCase;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.CreateAppointmentPort;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
@Transactional
public class CreateAppointmentService implements CreateAppointmentUseCase {

    //    private final LoadProfessionalPort loadProfessionalPort;
//    private final LoadClientPort loadClientPort;
    private final CreateAppointmentPort createAppointmentPort;
//    private final SearchAppointmentPort searchAppointmentPort;

    @Override
    public Mono<Appointment> createAppointment(CreateAppointmentCommand command) {
//        final Professional professional = loadProfessionalPort.loadProfessional(command.getProfessionalId());
//        final Client client = loadClientPort.loadClient(command.getClientId());

//        Objects.requireNonNull(client);
//        Objects.requireNonNull(professional);

//        searchAppointmentPort.checkProfessionalAppointmentExists(command.getDateTime(), command.getProfessionalId());
//        searchAppointmentPort.checkClientAppointmentExists(command.getDateTime(), command.getClientId());

        final Appointment appointment = new Appointment(command.getTitle(), command.getProfessionalId(), command.getClientId(), command.getLocalDateTime());


        return createAppointmentPort.create(appointment)
                .map(AppointmentMapper::mapToDomain);

    }


}
