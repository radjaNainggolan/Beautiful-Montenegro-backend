package com.gis.bmne.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.Park;

@Repository
public interface ParkRepository extends JpaRepository<Park, Long> {
	
	@Query(value = "select p.id from park as p order by p.id desc limit 1", nativeQuery = true)
	public Long getLastInsertedPark();
}
