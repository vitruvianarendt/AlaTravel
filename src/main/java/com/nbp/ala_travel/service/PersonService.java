package com.nbp.ala_travel.service;

import com.nbp.ala_travel.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository repository;

    public String registerByDefault(String new_firstname, String new_lastname, String new_email, String new_password,
                         String new_phonenumber, Integer new_istourguide) {
        try {
            repository.registerDefault(new_firstname, new_lastname, new_email, new_password, new_phonenumber, new_istourguide);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }

    public String registerDescPic(String new_firstname, String new_lastname, String new_email, String new_password,
                                String new_phonenumber, Integer new_istourguide, String description, String picture) {
        try {
            repository.registerDescPic(new_firstname, new_lastname, new_email, new_password, new_phonenumber,
                    new_istourguide, description, picture);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }

    public String login(String email, String password) {
        try {
            repository.login(email, password);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "OK";
    }
}
