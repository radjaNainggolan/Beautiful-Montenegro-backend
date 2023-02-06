package com.gis.bmne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.LocationImage;

@Repository
public interface LocationImageRepository extends JpaRepository<LocationImage, Long> {

}
