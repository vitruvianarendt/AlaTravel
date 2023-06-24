package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.FavouriteTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteTourRepository extends JpaRepository<FavouriteTour, Long> {

    @Query(value = "select * from saved_favourite_tour(:tourist_id, :tour_id)", nativeQuery = true)
    void savedFavouriteTour(Long tourist_id, Long tour_id);
}
