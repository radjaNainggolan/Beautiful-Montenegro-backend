package com.gis.bmne.models;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Polygon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	public Park() {
		super();
	}

//	public Park(@JsonProperty("name") String name, @JsonProperty("description") String description,@JsonProperty("geometry") Polygon<G2D> geometry) {
//		super();
//		this.name = name;
//		this.description = description;
//		this.geometry = geometry;
//	}
	
	
	public Park(@JsonProperty("id")Long id, @JsonProperty("name") String name, @JsonProperty("description") String description,@JsonProperty("geometry") Polygon<G2D> geometry) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.geometry = geometry;
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
	
	
}
