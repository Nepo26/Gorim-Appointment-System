package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.domain.Client;

public interface LoadClientPort {
    Client loadClient(String clientId);
}
