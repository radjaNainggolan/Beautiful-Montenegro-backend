package com.gis.bmne.services;

import org.springframework.stereotype.Service;

import com.gis.bmne.repositories.LocationImageRepository;

@Service
public class LocationImageService {

	LocationImageRepository locationImageRepository;
	
	public LocationImageService(LocationImageRepository locationImageRepository) {
		this.locationImageRepository = locationImageRepository;
	}
	
	public void deleteLocationImageById(Long id) {
		locationImageRepository.deleteById(id);
	}
}
