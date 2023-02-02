package com.gis.bmne;

import java.time.format.DateTimeFormatter;

import org.geolatte.geom.json.GeolatteGeomModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//
//import com.bedatadriven.jackson.datatype.jts.JtsModule;
//import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import static org.geolatte.geom.crs.CoordinateReferenceSystems.WGS84;
import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;


@SpringBootApplication
public class BmneApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmneApplication.class, args);
	}
	
	
	@Bean
	Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		var module = new GeolatteGeomModule( WGS84 );
		return new Jackson2ObjectMapperBuilder()
				.modules( module )
				.serializers( new LocalDateTimeSerializer( DateTimeFormatter.ISO_LOCAL_DATE_TIME ) )
				.deserializers( new LocalDateTimeDeserializer( DateTimeFormatter.ISO_LOCAL_DATE_TIME ) );
	}
	 
}
