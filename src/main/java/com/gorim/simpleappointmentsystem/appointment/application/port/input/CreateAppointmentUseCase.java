package com.gorim.simpleappointmentsystem.appointment.application.port.input;

import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import com.gorim.simpleappointmentsystem.appointment.domain.Client;
import com.gorim.simpleappointmentsystem.appointment.domain.Professional;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Optional;

public interface CreateAppointmentUseCase {

    Optional<Appointment> createAppointment(CreateAppointmentCommand command);

    @Value
    class CreateAppointmentCommand {

        @NotNull
        String title;

        @NotNull
        Client.ClientId clientId;

        @NotNull
        Professional.ProfessionalId professionalId;

        @NotNull
        LocalDateTime dateTime;

        public CreateAppointmentCommand(
                final String title,
                final Client.ClientId clientId,
                final Professional.ProfessionalId professionalId,
                final LocalDateTime dateTime
        ) {
            this.title = title;
            this.clientId = clientId;
            this.professionalId = professionalId;
            this.dateTime = dateTime;
        }

    }
}
