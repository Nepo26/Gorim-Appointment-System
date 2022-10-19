package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.client;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Collection;

@Document("clients")
@AllArgsConstructor
public class ClientEntity {
    @Id
    private ObjectId id;
    private ObjectId userId;
    private String name;
    private Collection<ObjectId> associatedProfessionals;
    private String cpf;
    private LocalDate birthdate;
    private String phoneNumber;
}
