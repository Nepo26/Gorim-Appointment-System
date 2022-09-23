package com.gorim.simpleappointmentsystem.appointment.adapter.input.web;

import com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment.AppointmentRepository;
import com.gorim.simpleappointmentsystem.appointment.domain.Client.ClientId;
import com.gorim.simpleappointmentsystem.appointment.domain.Professional.ProfessionalId;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentUseCase;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentUseCase.CreateAppointmentCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    private final CreateAppointmentUseCase createAppointmentUseCase;

    @PutMapping
    void createAppointment(
            @RequestParam("title") String title,
            @RequestParam("clientId") String clientId,
            @RequestParam("professionalId") String professionalId,
            @RequestParam("datetime") LocalDateTime dateTime
    ) {


        CreateAppointmentCommand command = new CreateAppointmentCommand(
                title,
                new ClientId(clientId),
                new ProfessionalId(professionalId),
                dateTime
        );

        createAppointmentUseCase.createAppointment(command);
    }





}
