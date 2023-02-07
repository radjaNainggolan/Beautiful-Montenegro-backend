package com.gis.bmne.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gis.bmne.models.Location;
import com.gis.bmne.services.LocationImageService;
import com.gis.bmne.services.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {
	
	LocationService locationService;
	LocationImageService locationImageService;
	
	@Autowired
	public LocationController(LocationService locationService, LocationImageService locationImageService) {
		super();
		this.locationService = locationService;
		this.locationImageService = locationImageService;
	}
	
	@GetMapping("/all")
	public List<Location> getAllLocations(){
		return locationService.getAllLocations();
	}
	
	@PostMapping("/newlocation")
	public void insertLocation(@RequestBody Location newLocation) {
		locationService.insertLocation(newLocation);
	}
	
	@GetMapping("/last")
	public Long getLastInsertedLocation() {
		return locationService.getLastInsertedLoaction();
	}
	
	@GetMapping("/{id}")
	public Location getLocationById(@PathVariable("id") Long id){
		return locationService.getLocationById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLocationById(@PathVariable("id") Long id) {
		locationService.deleteLocationById(id);
	}
	
	@PutMapping("/update")
	public void updateLocation(@RequestBody Location updateLocation) {
		locationService.updateLocation(updateLocation);
	}
	
	@DeleteMapping("/image/delete/{id}")
	public void deleteLocationImageById(@PathVariable("id") Long id) {
		locationImageService.deleteLocationImageById(id);
	}
	
}
