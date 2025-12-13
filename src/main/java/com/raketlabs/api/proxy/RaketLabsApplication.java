package com.raketlabs.api.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RaketLabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaketLabsApplication.class, args);
	}
}
