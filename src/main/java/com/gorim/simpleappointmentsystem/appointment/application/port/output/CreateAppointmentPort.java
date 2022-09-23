package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.domain.Appointment;

public interface CreateAppointmentPort {
    void create(Appointment appointment);
}
