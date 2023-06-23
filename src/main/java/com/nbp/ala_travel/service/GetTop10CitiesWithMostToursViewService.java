package com.nbp.ala_travel.service;


import com.nbp.ala_travel.model.GetTop10CitiesWithMostToursViewModel;
import com.nbp.ala_travel.repository.GetTop10CitiesWithMostToursViewRepository;
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
