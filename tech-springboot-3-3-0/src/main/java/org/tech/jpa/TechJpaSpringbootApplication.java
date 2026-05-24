package org.tech.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan("org.tech.jpa.entity")
public class TechJpaSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechJpaSpringbootApplication.class, args);
	}

}
