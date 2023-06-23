package com.nbp.ala_travel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    Long id;
    Integer grade;
    String description;
    Long tourguideid;
    Long tourid;
    Long touristid;
}
