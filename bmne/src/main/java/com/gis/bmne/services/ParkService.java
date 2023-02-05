package com.gis.bmne.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gis.bmne.models.Park;
import com.gis.bmne.repositories.ParkImageRepository;
import com.gis.bmne.repositories.ParkRepository;

@Service
public class ParkService {

	ParkRepository parkRepository;

	@Autowired
	public ParkService(ParkRepository parkRepository) {
		super();
		this.parkRepository = parkRepository;
		
	}
	
	public List<Park> getAllParks(){
		return parkRepository.findAll();
	}
	
	public void insertPark(Park newPark) {
		parkRepository.save(newPark);
	}
	
	public Long selectLastInsertedPark(){
		return parkRepository.getLastInsertedPark();
	}
	
	public Park getParkById(Long id) {
		Optional<Park> park = parkRepository.findById(id);
		return park.orElse(null); //this should be solved
	}
	
	public void deleteParkById(Long id) {
		parkRepository.deleteById(id);
	}
	
	public void updatePark(Park updatePark) {
		parkRepository.save(updatePark);
		//parkImageRepository.saveAll(updatePark.getImages());
	}
}
