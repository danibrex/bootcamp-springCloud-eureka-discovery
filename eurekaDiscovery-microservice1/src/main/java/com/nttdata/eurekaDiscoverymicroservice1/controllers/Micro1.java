package com.nttdata.eurekaDiscoverymicroservice1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Micro1 {
	
	@GetMapping("/micro1")
	public String micro2() {
		return "Soy el micro1";
	}

}
