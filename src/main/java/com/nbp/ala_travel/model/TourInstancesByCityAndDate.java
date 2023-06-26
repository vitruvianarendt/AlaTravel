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
public class TourInstancesByCityAndDate {
    @Id
    Long tour_id;
    Long starting_point_id;
    Long tour_guide_id;
    Long city_id;
    String title;
    String description;
    Integer duration;
    Integer max_number_participants;
}
