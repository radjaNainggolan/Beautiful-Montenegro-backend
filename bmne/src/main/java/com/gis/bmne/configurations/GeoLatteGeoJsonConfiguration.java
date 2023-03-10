package com.gis.bmne.configurations;

import static org.geolatte.geom.crs.CoordinateReferenceSystems.WGS84;

import java.time.format.DateTimeFormatter;

import org.geolatte.geom.json.GeolatteGeomModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Configuration
public class GeoLatteGeoJsonConfiguration {

	@Bean
	Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
		var module = new GeolatteGeomModule( WGS84 );
		return new Jackson2ObjectMapperBuilder()
				.modules( module )
				.serializers( new LocalDateTimeSerializer( DateTimeFormatter.ISO_LOCAL_DATE_TIME ) )
				.deserializers( new LocalDateTimeDeserializer( DateTimeFormatter.ISO_LOCAL_DATE_TIME ) );
	}
}
