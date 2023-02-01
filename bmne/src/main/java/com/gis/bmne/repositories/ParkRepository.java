package com.gis.bmne.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.Park;

@Repository
public interface ParkRepository extends JpaRepository<Park, Long> {

	@Query(value = "select p.id, p.name, p.description, ST_AsText(p.geometry) as wkt from park as p", nativeQuery = true)
	public List<Park> getAllParks();
}
