package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.GetTop10ToursWithMostBookings;
import com.nbp.ala_travel.repository.GetTop10ToursWithMostBookingsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetTop10ToursWithMostBookingsService {
    private final GetTop10ToursWithMostBookingsRepository repository;

    public List<GetTop10ToursWithMostBookings> getTop10ToursWithMostBookings() {
        return repository.getGetTop10ToursWithMostBookingsBy();
    }
}
