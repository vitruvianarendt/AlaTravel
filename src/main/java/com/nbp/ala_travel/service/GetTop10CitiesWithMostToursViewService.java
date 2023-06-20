package com.example.ala_travel.service;

import com.example.ala_travel.repository.GetTop10CitiesWithMostToursViewRepository;
import com.example.ala_travel.model.GetTop10CitiesWithMostToursViewModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetTop10CitiesWithMostToursViewService {
    private final GetTop10CitiesWithMostToursViewRepository repository;

    public List<GetTop10CitiesWithMostToursViewModel> getTop10CitiesWithMostTours() {
        return repository.getTop10CitiesWithMostTours();
    }
}
