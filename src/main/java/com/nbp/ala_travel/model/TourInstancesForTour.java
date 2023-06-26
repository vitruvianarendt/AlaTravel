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
public class TourInstancesForTour {
    @Id
    Long id;
    Long tour_id;
    Long tour_guide_id;
    Long language_id;
    LocalTime tour_time;
    LocalDate tour_date;
    Integer available_spots;
}
