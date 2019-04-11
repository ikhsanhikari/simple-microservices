package id.hikari.discovery.hikaridiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HikariDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikariDiscoveryApplication.class, args);
	}

}
