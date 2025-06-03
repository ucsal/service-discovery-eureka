package br.com.mariacfmendes.service_discovery_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryEurekaApplication.class, args);
	}

}
