package com.gorim.simpleappointmentsystem.appointment.application.port.output;

import com.gorim.simpleappointmentsystem.appointment.domain.Client;
import com.gorim.simpleappointmentsystem.appointment.domain.Client.ClientId;

public interface LoadClientPort {
    Client loadClient(ClientId clientId);
}
