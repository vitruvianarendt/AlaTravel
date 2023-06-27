package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.Tourguide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourguideRepository extends JpaRepository<Tourguide, Long> {
    Tourguide findByPersonid(Long personId);
}
