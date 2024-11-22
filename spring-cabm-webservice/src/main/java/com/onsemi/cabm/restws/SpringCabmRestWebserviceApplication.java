package com.onsemi.cabm.restws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.onsemi.cabm.controller", "com.onsemi.cabm.service"})
@EntityScan("com.onsemi.cabm.model")
@EnableJpaRepositories("com.onsemi.cabm.repository")
public class SpringCabmRestWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCabmRestWebserviceApplication.class, args);
	}

}
