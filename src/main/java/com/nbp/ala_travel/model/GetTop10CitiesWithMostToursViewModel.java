package com.example.ala_travel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class GetTop10CitiesWithMostToursViewModel {
    @Id
    Long city_id;
    String city_name;
    Long number_of_tours;

    public GetTop10CitiesWithMostToursViewModel() {
    }

    public GetTop10CitiesWithMostToursViewModel(Long city_id, String city_name, Long number_of_tours) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.number_of_tours = number_of_tours;
    }
}
