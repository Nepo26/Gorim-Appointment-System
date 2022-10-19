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

    private final String id;

    private final String userId;

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


    public static Client client(final String id,
                         final String userId,
                         final String name,
                         final Collection<String> associatedProfessionals,
                         final String cpf,
                         final LocalDate birthdate,
                         final String phoneNumber
                         ){
        return new Client( id, userId, name, associatedProfessionals, cpf, birthdate, phoneNumber );
    }


    public String getId() {
        return this.id;
    }

    public String getUserId(){
        return this.userId;
    }

    public void setName(final String name){
        this.name = name;
    }

    public void setPhoneNumber(final String phoneNumber){
        this.phoneNumber = phoneNumber;

    }

}
