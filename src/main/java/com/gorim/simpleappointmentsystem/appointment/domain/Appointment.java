package com.gorim.simpleappointmentsystem.appointment.domain;

import lombok.Getter;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

public class Appointment {

    @Getter
    private final String id;

    @Getter
    private final String name;

    @Getter
    private final String professionalId;

    @Getter
    private final String clientId;

    @Getter
    private final LocalDateTime datetime;

    public Appointment(final String name, final String professionalId, final String clientId, final LocalDateTime datetime) {
        this.id = new ObjectId().toString();
        this.name = name;
        this.professionalId = professionalId;
        this.clientId = clientId;
        this.datetime = datetime;
    }

    public Appointment(final String id, final String name, final String professionalId, final String clientId, final LocalDateTime datetime) {
        this.id = id;
        this.name = name;
        this.professionalId = professionalId;
        this.clientId = clientId;
        this.datetime = datetime;
    }

    public static Appointment appointment(final String name, final String professionalId, final String clientId, final LocalDateTime datetime) {
        return new Appointment(new ObjectId().toString(), name, professionalId, clientId, datetime);
    }

    public static Appointment appointment(final String id, final String name, final String professionalId, final String clientId, final LocalDateTime datetime) {
        return new Appointment(id, name, professionalId, clientId, datetime);
    }

}
