package com.nbp.ala_travel.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginPersonResponse {
    Person person;
    String message;

    public Person getPerson() {
        return person;
    }

    public String getMessage() {
        return message;
    }
}
