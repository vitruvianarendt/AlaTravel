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
public class TouristFavouriteTours {

    @Id
    Long id;
    Long country_id;
    Long city_id;
    Long tour_id;
    Long tour_guide_id;
    String country_name;
    String city_name;
    String tour_name;
    String tour_guide_first_name;
    String tour_guide_last_name;
    Long tourist_id;
    String tour_title;
}
