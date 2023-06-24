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
public class TouristSavedTourInstances {

    @Id
    Long id;
    Long country_id;
    Long city_id;
    Long tour_id;
    Long tour_guide_id;
    Long saved_tour_instance_id;
    String country_name;
    String city_name;
    String tour_name;
    String tour_instance_language;
    LocalDate tour_date;
    LocalTime tour_time;
    Long tourist_id;
}
