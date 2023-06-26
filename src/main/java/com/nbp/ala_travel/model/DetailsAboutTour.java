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
public class DetailsAboutTour {
    @Id
    Long id;
    Long startingpointid;
    Double latitude;
    Double longitude;
    Long tourugideid;
    Long city_id;
    String city_name;
    String title;
    String description;
    Integer duration;
    Integer maxnumberofparticipants;
    Long tour_guide_id;
    Long personid;
    Long organizationid;
    String guide_description;
    String profilepicture;
}
