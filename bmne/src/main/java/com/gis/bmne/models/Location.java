package com.gis.bmne.models;

import java.util.List;

import org.geolatte.geom.G2D;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.geolatte.geom.Point;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(
			name = "name",
			nullable = false,
			columnDefinition = "varchar(100)"
	)
	private String name;
	
	
	@Column(
			name = "description",
			nullable = false,
			columnDefinition = "text"
	)
	private String description;
	
	
	@Column(
			name = "geometry",
			columnDefinition = "geometry(POINT,3857)"
	)
	private Point<G2D> geometry;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "location_id", referencedColumnName = "id")
	private List<LocationImage> images;

	public Location() {
		super();
	}


	public Location(@JsonProperty("id") Long id, @JsonProperty("name") String name, @JsonProperty("description") String description, @JsonProperty("geometry") Point<G2D> geometry, @JsonProperty("images") List<LocationImage> images) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.geometry = geometry;
		this.images = images;
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Point<G2D> getGeometry() {
		return geometry;
	}


	public void setGeometry(Point<G2D> geometry) {
		this.geometry = geometry;
	}


	public List<LocationImage> getImages() {
		return images;
	}


	public void setImages(List<LocationImage> images) {
		this.images = images;
	} 
	
	
	
	
}
