package com.gis.bmne.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long id;
	
	@Column(
			name = "url",
			columnDefinition = "varchar(255)"
	)
	@JsonProperty("url")
	private String url;
	
}
