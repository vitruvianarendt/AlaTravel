package com.nbp.ala_travel.service;

import com.nbp.ala_travel.model.LandmarkDTO;
import com.nbp.ala_travel.repository.CalculateDistanceBetweenLandmarksServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
@AllArgsConstructor
public class CalculateDistanceBetweenLandmarksService {
    private final CalculateDistanceBetweenLandmarksServiceRepository repository;

    public List<LandmarkDTO> getLandmarkDto() {
        return repository.getLandmarkDTO();
    }

    public Double calculateDistance(Long landmarkid1, Long landmarkid2) {
        BigDecimal bd = BigDecimal.valueOf(repository.calculateDistance(landmarkid1,landmarkid2));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
