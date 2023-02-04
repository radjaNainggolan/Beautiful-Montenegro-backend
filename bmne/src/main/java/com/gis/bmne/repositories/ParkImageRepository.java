package com.gis.bmne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.ParkImage;

@Repository
public interface ParkImageRepository extends JpaRepository<ParkImage, Long>{

}
