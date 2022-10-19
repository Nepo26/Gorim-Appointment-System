package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.professional;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

@Document("professionals")
@AllArgsConstructor
public class ProfessionalEntity {

    @Id
    private ObjectId id;
    private ObjectId userId;
    private String name;
    private String description;
    private String expertise;
    private Collection<LocalDateTime> openHours;
    private final String cpf;
    private final LocalDate birthdate;
    private final Collection<ObjectId> associatedClients;
}
