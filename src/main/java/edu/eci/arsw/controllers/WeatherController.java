package edu.eci.arsw.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/weather")
public class WeatherController {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getCityByName(@RequestBody String namecity){
		try {
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>("ERROR", HttpStatus.NOT_FOUND);
		}
	}
	
}
