package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import com.gorim.simpleappointmentsystem.appointment.application.port.output.CreateAppointmentPort;
import com.gorim.simpleappointmentsystem.appointment.application.port.output.ListAppointmentsPort;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Objects;

@RequiredArgsConstructor
@Component
public class AppointmentPersistenceAdapter implements CreateAppointmentPort, ListAppointmentsPort {
    private final AppointmentRepository appointmentRepository;

    @Override
    public Mono<AppointmentEntity> create(final Appointment appointment) {
        final AppointmentEntity entity = AppointmentEntity.builder()
                .id(ObjectId.get())
                .name(appointment.getName())
                .professionalId(new ObjectId(appointment.getProfessionalId()))
                .clientId(new ObjectId(appointment.getClientId()))
                .datetime(appointment.getDatetime())
                .build();

        Objects.requireNonNull(entity);
        return appointmentRepository.save(entity);
    }

    @Override
    public Flux<AppointmentEntity> list() {
        return appointmentRepository.findAll()
                .delayElements(Duration.ofSeconds(2));
    }
}
