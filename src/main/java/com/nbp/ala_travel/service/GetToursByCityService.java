package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.GetToursByCity;
import com.nbp.ala_travel.repository.GetToursByCityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetToursByCityService {

    private final GetToursByCityRepository repository;

    public List<GetToursByCity> getToursByCity(Long cityId) {
        return repository.getToursByCity(cityId);
    }
}
