package com.gorim.simpleappointmentsystem.appointment.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Client {

    private final ClientId id;

    private final User.UserId userId;

    @Getter
    private String name;

    @Getter
    private final Collection<String> associatedProfessionals;

    @Getter
    private final String cpf;

    @Getter
    private final LocalDate birthdate;

    @Getter
    private String phoneNumber;

    @Value
    public static class ClientId {
        String value;
    }

    public static Client client(final String id,
                         final String userId,
                         final String name,
                         final Collection<String> associatedProfessionals,
                         final String cpf,
                         final LocalDate birthdate,
                         final String phoneNumber
                         ){
        return new Client( new ClientId(id), new User.UserId(userId), name, associatedProfessionals, cpf, birthdate, phoneNumber );
    }


    public Optional<ClientId> getId() {
        return Optional.ofNullable(this.id);
    }

    public Optional<User.UserId> getUserId(){
        return Optional.ofNullable(this.userId);
    }

    public void setName(final String name){
        this.name = name;
    }

    public void setPhoneNumber(final String phoneNumber){
        this.phoneNumber = phoneNumber;

    }

}
