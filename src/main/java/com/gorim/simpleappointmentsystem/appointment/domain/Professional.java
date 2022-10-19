package com.gorim.simpleappointmentsystem.appointment.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Professional {

    private final String id;

    private final String userId;
    @Getter
    private final String cpf;
    @Getter
    private final LocalDate birthdate;
    @Getter
    private final Collection<String> associatedClients;
    @Getter
    private String name;
    @Getter
    private String description;
    @Getter
    private String expertise;
    @Getter
    private Collection<LocalDateTime> openHours;

    public static Professional professional(final String id, final String userId, final String name, final String description, final String expertise, final Collection<LocalDateTime> openHours, final String cpf, final LocalDate birthdate, final Collection<String> associatedClients) {
        return new Professional(id, userId, cpf, birthdate, associatedClients, name, description, expertise, openHours);
    }

    public String getUserId() {
        return this.userId;
    }

    public String getId() {
        return this.id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setExpertise(final String expertise) {
        this.expertise = expertise;
    }

    public void setOpenHours(final Collection<LocalDateTime> openHours) {
        this.openHours = openHours;
    }

    public void addAssociatedClient(final String client) {
        this.associatedClients.add(client);
    }

}
