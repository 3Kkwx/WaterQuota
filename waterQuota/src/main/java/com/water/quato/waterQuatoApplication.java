package com.water.quato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.water.quato.*")
public class waterQuatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(waterQuatoApplication.class, args);
	}

}
