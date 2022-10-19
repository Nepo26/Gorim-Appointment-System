package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;

public class AppointmentMapper {
    public static Appointment mapToDomain(final AppointmentEntity appointmentEntity) {
        return new Appointment(
                appointmentEntity.getId().toString(),
                appointmentEntity.getName(),
                appointmentEntity.getProfessionalId().toString(),
                appointmentEntity.getClientId().toString(),
                appointmentEntity.getDatetime()
        );
    }
}
