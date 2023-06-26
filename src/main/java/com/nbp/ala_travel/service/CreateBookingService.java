package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.CreateBooking;
import com.nbp.ala_travel.model.CreateBookingResponse;
import com.nbp.ala_travel.repository.CreateBookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateBookingService {
    private final CreateBookingRepository repository;

    public CreateBookingResponse createBooking(Integer number_of_participants, Long tourist_id, Long tour_instance_id) {
        CreateBooking booking = new CreateBooking();
        try {
            booking = repository.createBooking(number_of_participants, tourist_id, tour_instance_id);
        } catch (Exception e) {
            return new CreateBookingResponse(booking, e.getMessage());
        }
        return new CreateBookingResponse(booking, "OK");
    }

}
