package com.gis.bmne.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gis.bmne.models.Location;
import com.gis.bmne.repositories.LocationRepository;

@Service
public class LocationService {

	LocationRepository locationRepository;
	
	@Autowired
	public LocationService(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}
	
	
	public List<Location> getAllLocations(){
		return locationRepository.findAll();
	}
	
	public void insertLocation(Location newLocation) {
		locationRepository.save(newLocation);
	}
	
	public Long getLastInsertedLoaction() {
		return locationRepository.getLastInsertedLocation();
	}
}
