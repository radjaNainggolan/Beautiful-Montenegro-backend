package com.gis.bmne.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
