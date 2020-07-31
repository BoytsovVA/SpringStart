package com.springboot.h2;

import com.springboot.h2.model.Person;
import com.springboot.h2.model.PersonViewBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

@SpringBootApplication
public class Appmain {

	public static void main(String[] args) {
		SpringApplication.run(Appmain.class, args);
	}

	@Bean
	@SessionScope
	public PersonViewBean personViewBean() {
		return new PersonViewBean();
	}
}
