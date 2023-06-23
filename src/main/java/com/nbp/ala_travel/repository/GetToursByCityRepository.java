package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.GetToursByCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetToursByCityRepository extends JpaRepository<GetToursByCity, Long> {
    @Query(value = "select * from get_tours_by_city(:cityId)", nativeQuery = true)
    List<GetToursByCity> getToursByCity(Long cityId);
}
