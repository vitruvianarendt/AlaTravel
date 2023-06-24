package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.TouristFavouriteTours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristFavouriteToursRepository extends JpaRepository<TouristFavouriteTours, Long> {

    @Query(value = "select * from filter_favourite_tours(:touristid, :city_name)", nativeQuery = true)
    List<TouristFavouriteTours> filter_favourite_tours(Long touristid, String city_name);
}
