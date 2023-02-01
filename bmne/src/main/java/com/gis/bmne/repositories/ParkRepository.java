package com.gis.bmne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.Park;

@Repository
public interface ParkRepository extends JpaRepository<Park, Long> {

}
