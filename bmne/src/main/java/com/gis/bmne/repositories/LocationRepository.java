package com.gis.bmne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gis.bmne.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

	@Query(value = "select l.id from location as l order by l.id desc limit 1", nativeQuery = true)
	public Long getLastInsertedLocation();
}
