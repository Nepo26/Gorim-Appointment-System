package com.gorim.simpleappointmentsystem.appointment.adapter.input.web;

import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentCommand;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.CreateAppointmentUseCase;
import com.gorim.simpleappointmentsystem.appointment.application.port.input.ListAppointmentsUseCase;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/appointment")
@RequiredArgsConstructor
@Slf4j
public class AppointmentController {

    private final CreateAppointmentUseCase createAppointmentUseCase;
    private final ListAppointmentsUseCase listAppointmentsUseCase;

    @PutMapping(produces = "application/json")
    public Mono<Appointment> createAppointment(
            @RequestParam("title") String title,
            @RequestParam("clientId") String clientId,
            @RequestParam("professionalId") String professionalId,
            @RequestParam("localDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime localDateTime
    ) {


        CreateAppointmentCommand command = new CreateAppointmentCommand(
                title,
                clientId,
                professionalId,
                localDateTime
//                dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()
        );

        return createAppointmentUseCase.createAppointment(command);
    }

    // "application/x-ndjson"
    @GetMapping(path = "/test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Appointment> listAppointments() {
        log.debug("Requests list of appointments");
        return listAppointmentsUseCase.listAppointments();
    }


}
