package com.gis.bmne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
