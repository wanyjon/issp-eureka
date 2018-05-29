package com.issp.halo.isspeureka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.function.Predicate;

@EnableEurekaServer
@SpringBootApplication
public class IsspEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsspEurekaApplication.class, args);
	}

}
