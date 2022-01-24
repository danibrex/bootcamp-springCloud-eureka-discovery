package com.nttdata.eurekaDiscoverymicroservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaDiscoveryMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryMicroservice2Application.class, args);
	}

}
