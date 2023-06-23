package com.nbp.ala_travel.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetTop10ToursWithMostBookings {
    @Id
    Long tour_id;
    String title;
    String city_name;
    Long number_of_tours;

}

