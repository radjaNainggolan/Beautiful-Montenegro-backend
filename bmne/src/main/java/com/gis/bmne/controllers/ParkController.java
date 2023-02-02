package com.gis.bmne.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gis.bmne.models.Park;
import com.gis.bmne.services.ParkService;

@RestController
@RequestMapping("/parks")
public class ParkController {

	ParkService parkService;

	public ParkController(ParkService parkService) {
		super();
		this.parkService = parkService;
	}
	
	@GetMapping
	List<Park> getAllParks(){
		return parkService.getAllParks();
	}
	
	@PostMapping
	void insertPark(@RequestBody Park newPark) {
		parkService.insertPark(newPark);
	}
	
	@GetMapping("/last")
	public Long getLastInsertedPark(){
		return parkService.selectLastInsertedPark();
	}
}
