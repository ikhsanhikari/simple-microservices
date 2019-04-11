package id.hikari.service2.hikariservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HikariService2Application {

	public static void main(String[] args) {
		SpringApplication.run(HikariService2Application.class, args);
	}

}
