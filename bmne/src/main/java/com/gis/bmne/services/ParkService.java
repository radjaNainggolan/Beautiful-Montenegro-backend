package com.gis.bmne.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gis.bmne.models.Park;
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
	
}
