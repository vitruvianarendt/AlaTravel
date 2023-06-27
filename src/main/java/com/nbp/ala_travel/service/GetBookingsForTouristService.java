package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.GetBookingsForTourist;
import com.nbp.ala_travel.repository.GetBookingsForTouristRepository;
import com.nbp.ala_travel.repository.TouristRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetBookingsForTouristService {
    private final GetBookingsForTouristRepository repository;
    private final TouristRepository touristRepository;
    public List<GetBookingsForTourist> getBookingsForTourist(Long personId) {
        return repository.getBookingsForTourist(touristRepository.findByPersonid(personId).getId());
    }
}
