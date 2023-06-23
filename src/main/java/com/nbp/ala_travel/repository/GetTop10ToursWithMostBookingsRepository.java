package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.GetTop10ToursWithMostBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetTop10ToursWithMostBookingsRepository extends JpaRepository<GetTop10ToursWithMostBookings, Long> {

    @Query(value = "select * from get_top10_tours_with_most_bookings();", nativeQuery = true)
    List<GetTop10ToursWithMostBookings> getGetTop10ToursWithMostBookingsBy();
}
