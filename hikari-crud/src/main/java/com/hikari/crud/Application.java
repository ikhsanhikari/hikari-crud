package com.hikari.crud;

import org.springframework.boot.SpringApplication;
import com.hikari.crud.property.FileStorageProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
		FileStorageProperties.class
})
@SpringBootApplication
public class Application {

	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
