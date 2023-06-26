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
public class GetToursByCity {
    @Id
    Long id;
    Long starting_point_id;             // ako treba adresa model plus
    Long tour_guide_id;                 // ako treba ime i prezime na vodic model plus
    Long city_id;                       // ako treba ime na grad model plus
    String title;
    String description;
    Integer duration;
    Integer max_number_of_participants;
    String city_name;
    String tourguide_name;
}
