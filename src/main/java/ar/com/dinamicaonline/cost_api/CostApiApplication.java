package ar.com.dinamicaonline.cost_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CostApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostApiApplication.class, args);
	}

}
