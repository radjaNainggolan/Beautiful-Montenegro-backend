package com.gis.bmne.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gis.bmne.models.Location;
import com.gis.bmne.services.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {
	
	LocationService locationService;
	
	@Autowired
	public LocationController(LocationService locationService) {
		super();
		this.locationService = locationService;
	}
	
	public List<Location> getAllLocations(){
		return locationService.getAllLocations();
	}
	
}