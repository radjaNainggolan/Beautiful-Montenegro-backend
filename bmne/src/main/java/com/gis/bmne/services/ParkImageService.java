package com.gis.bmne.services;

import org.springframework.stereotype.Service;

import com.gis.bmne.repositories.ParkImageRepository;

@Service
public class ParkImageService {

	ParkImageRepository parkImageRepository;
	
	public ParkImageService(ParkImageRepository parkImageRepository) {
		this.parkImageRepository = parkImageRepository;
	}
	
	public void deleteParkImageById(Long id) {
		parkImageRepository.deleteById(id);
	}
	
}
