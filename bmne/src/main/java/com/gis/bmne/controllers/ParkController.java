package com.gis.bmne.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gis.bmne.models.Park;
import com.gis.bmne.services.ParkImageService;
import com.gis.bmne.services.ParkService;

@RestController
@RequestMapping("/parks")
public class ParkController {

	ParkService parkService;
	ParkImageService parkImageService;

	@Autowired
	public ParkController(ParkService parkService, ParkImageService parkImageService) {
		super();
		this.parkService = parkService;
		this.parkImageService = parkImageService;
	}
	
	@GetMapping("/all")
	List<Park> getAllParks(){
		return parkService.getAllParks();
	}
	
	@PostMapping("/newpark")
	void insertPark(@RequestBody Park newPark) {
		parkService.insertPark(newPark);
	}
	
	@GetMapping("/last")
	public Long getLastInsertedPark(){
		return parkService.selectLastInsertedPark();
	}
	
	@GetMapping("/{id}")
	public Park getParkById(@PathVariable("id") Long id) {
		return parkService.getParkById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteParkById(@PathVariable("id") Long id) {
		parkService.deleteParkById(id);
	}
	
	@PutMapping("/update")
	public void updatePark(@RequestBody Park park) {
		parkService.updatePark(park); 
	}
	
	@DeleteMapping("/image/delete/{id}")
	public void deleteImageById(@PathVariable("id") Long id){
		parkImageService.deleteParkImageById(id);
	}
	
}
