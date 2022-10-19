package com.gorim.simpleappointmentsystem.appointment.application.port.input;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class CreateAppointmentCommand {


    @Getter
    @NotNull
    String title;
    @Getter
    @NotNull
    String clientId;

    @Getter
    @NotNull
    String professionalId;

    @Getter
    @NotNull
    LocalDateTime localDateTime;

    public CreateAppointmentCommand(
            final String title,
            final String clientId,
            final String professionalId,
            final LocalDateTime localDateTime
    ) {
        this.title = title;
        this.clientId = clientId;
        this.professionalId = professionalId;
        this.localDateTime = localDateTime;
    }


}

