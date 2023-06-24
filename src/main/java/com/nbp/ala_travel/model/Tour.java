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
public class Tour {
    @Id
    Long id;
    Long startingpointid;
    Long tourguideid;
    Long cityid;
    String title;
    String description;
    Integer duration;
    Integer maxnumberofparticipants;
}
