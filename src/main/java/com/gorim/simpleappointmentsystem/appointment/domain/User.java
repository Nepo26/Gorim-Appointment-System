package com.gorim.simpleappointmentsystem.appointment.domain;

import com.gorim.simpleappointmentsystem.appointment.domain.enums.RolesEnum;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Collection;

@AllArgsConstructor
public class User {
    final String username;
    final String password;
    final Collection<RolesEnum> roles;

    @Value
    public static class UserId {
        String value;
    }

    public static User user(final String username, final String password, final Collection<RolesEnum> roles) {
        return new User(username, password, roles);
    }

    public void addRole(RolesEnum role){
        this.roles.add(role);
    }

    public void removeRole(RolesEnum role){
        this.roles.remove(role);
    }




}
