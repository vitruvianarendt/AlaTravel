package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.GetBookingsForTourist;
import com.nbp.ala_travel.repository.GetBookingsForTouristRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetBookingsForTouristService {
    private final GetBookingsForTouristRepository repository;

    public List<GetBookingsForTourist> getBookingsForTourist(Long touristId) {
        return repository.getBookingsForTourist(touristId);
    }
}
