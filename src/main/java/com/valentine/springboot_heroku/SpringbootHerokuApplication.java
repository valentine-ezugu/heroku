package com.valentine.springboot_heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication(scanBasePackages = {"com.valentine"})
@EnableAutoConfiguration
@EnableCaching
public class SpringbootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHerokuApplication.class, args);
	}

}
