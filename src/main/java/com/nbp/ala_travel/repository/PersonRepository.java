package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "select * from register(:new_firstname, :new_lastname, :new_email, " +
            ":new_password, :new_phonenumber, :new_istourguide)", nativeQuery = true)
    void registerDefault(String new_firstname, String new_lastname, String new_email, String new_password,
                    String new_phonenumber, Integer new_istourguide);

    @Query(value = "select * from register(:new_firstname, :new_lastname, :new_email, " +
            ":new_password, :new_phonenumber, :new_istourguide, :description, :picture)", nativeQuery = true)
    void registerDescPic(String new_firstname, String new_lastname, String new_email, String new_password,
                         String new_phonenumber, Integer new_istourguide, String description, String picture);

    @Query(value = "select * from login(:email, :password)", nativeQuery = true)
    Person login(String email, String password);
}
