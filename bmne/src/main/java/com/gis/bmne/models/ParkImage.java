package com.gis.bmne.models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class ParkImage { 

	@Id
	@JoinColumn(name = "park_id")
	@ManyToOne
	private Park park;

	@Column(
			name = "link",
			columnDefinition = "varchar(255)"
	)
	private String link;

	
	
	public ParkImage() {
		super();
	}



	public ParkImage(Park park, String link) {
		super();
		this.park = park;
		this.link = link;
	}



	public Park getPark() {
		return park;
	}



	public void setPark(Park park) {
		this.park = park;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}
	
	
}
