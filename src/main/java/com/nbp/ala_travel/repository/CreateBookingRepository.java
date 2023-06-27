package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.CreateBooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateBookingRepository extends JpaRepository<CreateBooking, Long> {
    @Query(value = "select * from create_booking(:number_of_participants, :tourist_id, :tour_instance_id)", nativeQuery = true)
    CreateBooking createBooking(Integer number_of_participants, Long tourist_id, Long tour_instance_id);
}
