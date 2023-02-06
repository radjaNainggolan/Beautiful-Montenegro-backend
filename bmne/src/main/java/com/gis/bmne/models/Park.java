package com.gis.bmne.models;

import java.util.List;
import java.util.Set;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Polygon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Park {
	
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
			columnDefinition = "text",
			nullable = false
	)
	private String description;
	
	
	@Column(
			name = "geometry",
			columnDefinition = "geometry(Polygon,3857)"
	)
	private Polygon<G2D> geometry; 
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "park_id", referencedColumnName = "id")
	private List<ParkImage> images;

	public Park() {
		super();
	}

	
	
	public Park(@JsonProperty("id")Long id, @JsonProperty("name") String name, @JsonProperty("description") String description,@JsonProperty("geometry") Polygon<G2D> geometry, @JsonProperty("images") List<ParkImage> images) {
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

	public Polygon<G2D> getGeometry() {
		return geometry;
	}

	public void setGeometry(Polygon<G2D> geometry) {
		this.geometry = geometry;
	}



	public List<ParkImage> getImages() {
		return images;
	}


	public void setImages(List<ParkImage> images) {
		this.images = images;
	}
	
	
}
