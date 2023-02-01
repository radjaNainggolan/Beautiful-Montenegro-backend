package com.gis.bmne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bedatadriven.jackson.datatype.jts.JtsModule;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootApplication
public class BmneApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmneApplication.class, args);
	}
 
	
	@Bean
    public JtsModule jtsModule(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>JST MoDULE LOADED>>>>>>>>>>>>>>>>> ");
        return new JtsModule();
    }

    @Bean
    ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
        mapper.registerModule(new JtsModule());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>JST MoDULE CONFIGURED>>>>>>>>>>>>>>>>> ");
        return mapper;
    }
	
}
