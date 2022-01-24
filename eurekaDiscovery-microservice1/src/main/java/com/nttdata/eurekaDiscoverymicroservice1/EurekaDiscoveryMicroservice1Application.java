package com.nttdata.eurekaDiscoverymicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaDiscoveryMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryMicroservice1Application.class, args);
	}

}
