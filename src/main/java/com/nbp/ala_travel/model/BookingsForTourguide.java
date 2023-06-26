package com.nbp.ala_travel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingsForTourguide {
    @Id
    Long id;
    String title;
    String city_name;
    String tourist_email;
    Integer number_of_participants;
    LocalDate ti_date;
    LocalTime ti_time;
}
