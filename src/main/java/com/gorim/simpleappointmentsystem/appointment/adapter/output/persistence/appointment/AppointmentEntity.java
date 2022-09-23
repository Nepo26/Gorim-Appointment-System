package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import com.gorim.simpleappointmentsystem.appointment.domain.Client.ClientId;
import com.gorim.simpleappointmentsystem.appointment.domain.Professional.ProfessionalId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.util.BsonUtils;

import java.time.LocalDateTime;

@Document
@AllArgsConstructor
public class AppointmentEntity {

    @Id
    private ObjectId _id;

    private String name;

    private ObjectId professionalId;

    private ObjectId clientId;

    private LocalDateTime datetime;
}
