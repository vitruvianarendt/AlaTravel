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
public class TourInstance {
    @Id
    Long id;
    Long tourid;
    Long tourguideid;
    Long languageid;
    LocalTime time;
    LocalDate date;
    Integer availablespots;
}
