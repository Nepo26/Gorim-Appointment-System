package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("appointments")
@Builder
public class AppointmentEntity {

    @Id
    @Getter
    private ObjectId id;

    @Getter
    private String name;

    @Getter
    private ObjectId professionalId;

    @Getter
    private ObjectId clientId;

    @Getter
    private LocalDateTime datetime;
}
