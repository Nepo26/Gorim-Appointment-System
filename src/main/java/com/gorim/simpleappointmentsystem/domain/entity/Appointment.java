package com.gorim.simpleappointmentsystem.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Appointment {
    @Getter
    final String name;

    @Getter
    final Professional.ProfessionalId professionalId;

    @Getter
    final Client.ClientId clientId;

    @Getter
    final LocalDateTime datetime;

    public static Appointment appointment(final String name, final Professional.ProfessionalId professional, final Client.ClientId client, final LocalDateTime datetime){
        return new Appointment(name, professional, client, datetime);
    }

}
