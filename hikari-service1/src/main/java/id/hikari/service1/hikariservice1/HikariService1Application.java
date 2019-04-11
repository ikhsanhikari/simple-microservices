package id.hikari.service1.hikariservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HikariService1Application {

	public static void main(String[] args) {
		SpringApplication.run(HikariService1Application.class, args);
	}

}
