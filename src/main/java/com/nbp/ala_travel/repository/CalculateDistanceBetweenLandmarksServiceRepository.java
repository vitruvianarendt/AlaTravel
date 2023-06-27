package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.LandmarkDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculateDistanceBetweenLandmarksServiceRepository extends JpaRepository<LandmarkDTO,Long>{

    @Query(value = "select * from get_landmarks_dto()", nativeQuery = true)
    List<LandmarkDTO> getLandmarkDTO();

    @Query(value = "select * from calculate_landmark_distance(:landmarkid1, :landmarkid2)", nativeQuery = true)
    Double calculateDistance(Long landmarkid1, Long landmarkid2);
}
