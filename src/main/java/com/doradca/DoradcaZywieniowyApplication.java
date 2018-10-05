package com.doradca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.doradca.controller.PageConroller;
import com.doradca.repository.DietetykRepository;

@ComponentScan(basePackageClasses = PageConroller.class)
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackageClasses = DietetykRepository.class)

public class DoradcaZywieniowyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoradcaZywieniowyApplication.class, args);
	}
}
