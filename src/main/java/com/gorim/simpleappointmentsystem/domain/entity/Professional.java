package com.gorim.simpleappointmentsystem.domain.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Professional {

    private final ProfessionalId id;

    private final User.UserId userId;

    @Getter
    private String name;

    @Getter
    private String description;

    @Getter
    private String expertise;

    @Getter
    private Collection<LocalDateTime> openHours;

    @Getter
    private final String cpf;

    @Getter
    private final LocalDate birthdate;

    @Getter
    private final Collection<String> associatedClients;

    @Value
    public static class ProfessionalId {
        String value;
    }

    public static Professional professional(final String id, final String userId, final String name, final String description, final String expertise, final Collection<LocalDateTime> openHours, final String cpf, final LocalDate birthdate, final Collection<String> associatedClients){
        return new Professional(new ProfessionalId(id), new User.UserId(userId), name, description, expertise, openHours, cpf, birthdate, associatedClients);
    }

    public Optional<User.UserId> getUserId(){
        return Optional.ofNullable(this.userId);
    }

    public Optional<ProfessionalId> getId(){
        return Optional.ofNullable(this.id);
    }

    public void setName(final String name){
        this.name = name;
    }

    public void setDescription(final String name){
        this.name = name;
    }

    public void setExpertise(final String expertise){
        this.expertise = expertise;
    }

    public void setOpenHours(final Collection<LocalDateTime> openHours){
        this.openHours = openHours;
    }

    public void addAssociatedClient(final String client){
        this.associatedClients.add(client);
    }

}
