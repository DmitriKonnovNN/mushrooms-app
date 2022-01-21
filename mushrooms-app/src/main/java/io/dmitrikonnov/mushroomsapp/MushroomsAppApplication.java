package io.dmitrikonnov.mushroomsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MushroomsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MushroomsAppApplication.class, args);
	}

}
