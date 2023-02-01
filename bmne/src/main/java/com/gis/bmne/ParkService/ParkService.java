package com.gis.bmne.ParkService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gis.bmne.models.Park;
import com.gis.bmne.repositories.ParkRepository;

@Service
public class ParkService {

	ParkRepository parkRepository;

	public ParkService(ParkRepository parkRepository) {
		super();
		this.parkRepository = parkRepository;
	}
	
	List<Park> getAllParks(){
		return parkRepository.findAll();
	}
	
}
