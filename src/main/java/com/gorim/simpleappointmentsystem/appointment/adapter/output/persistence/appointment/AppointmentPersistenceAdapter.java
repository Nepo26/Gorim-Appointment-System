package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import com.gorim.simpleappointmentsystem.appointment.application.port.output.CreateAppointmentPort;
import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import java.util.Objects;

@RequiredArgsConstructor
@Component
public class AppointmentPersistenceAdapter implements CreateAppointmentPort {

    private final AppointmentRepository appointmentRepository;
    @Override
    public void create(final Appointment appointment) {
        final AppointmentEntity entity = new AppointmentEntity(ObjectId.get(),appointment.getName(), appointment.getProfessionalId(),appointment.getClientId(),appointment.getDatetime());
        Objects.requireNonNull(entity);
        appointmentRepository.save(entity);
    }
}
