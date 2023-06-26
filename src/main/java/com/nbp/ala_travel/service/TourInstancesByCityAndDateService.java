package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.TourInstancesByCityAndDate;
import com.nbp.ala_travel.repository.TourInstancesByCityAndDateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class TourInstancesByCityAndDateService {
    private final TourInstancesByCityAndDateRepository repository;

    public List<TourInstancesByCityAndDate> tourInstancesByCityAndStartDate(Long city_id, LocalDate start_date) {
        return repository.tourInstancesByCityAndStartDate(city_id, start_date);
    }
}
