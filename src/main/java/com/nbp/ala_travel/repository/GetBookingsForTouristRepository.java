package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.GetBookingsForTourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetBookingsForTouristRepository extends JpaRepository<GetBookingsForTourist, Long> {

    @Query(value = "select * from get_bookings_for_tourist(:touristId)", nativeQuery = true)
    List<GetBookingsForTourist> getBookingsForTourist(Long touristId);
}
