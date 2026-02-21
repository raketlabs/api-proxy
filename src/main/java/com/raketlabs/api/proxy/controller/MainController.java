package com.raketlabs.api.proxy.controller;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController("/")
public class MainController {

	@RequestMapping
	public ResponseEntity proxy(@RequestParam(name = "q", required = true) String url) {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = URI.create(url);
		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		HttpStatus status = response.getStatusCode();

		if (status == HttpStatus.OK) {
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.internalServerError().build();
	}
}
