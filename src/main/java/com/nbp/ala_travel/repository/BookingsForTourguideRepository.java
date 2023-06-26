package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.BookingsForTourguide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingsForTourguideRepository extends JpaRepository<BookingsForTourguide, Long> {
    @Query(value = "select * from get_bookings_for_tourguide(:tourguide_id)", nativeQuery = true)
    List<BookingsForTourguide> getBookingsForTourguide(Long tourguide_id);
}
