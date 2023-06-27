package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.BookingsForTourguide;
import com.nbp.ala_travel.repository.BookingsForTourguideRepository;
import com.nbp.ala_travel.repository.TourguideRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingsForTourguideService {
    private final BookingsForTourguideRepository repository;
    private final TourguideRepository tourguideRepository;

    public List<BookingsForTourguide> getBookingsForTourguide(Long tourguide_id) {
        return repository.getBookingsForTourguide(tourguide_id);
    }

    public List<BookingsForTourguide> getBookingsFromPersonid(Long personId) {
        return repository.getBookingsForTourguide(tourguideRepository.findByPersonid(personId).getId());
    }
}
