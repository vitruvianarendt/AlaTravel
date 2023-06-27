package com.nbp.ala_travel.repository;

import com.nbp.ala_travel.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long> {
    Tourist findByPersonid(Long personId);
}
