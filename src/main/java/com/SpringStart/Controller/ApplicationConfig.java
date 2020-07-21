package com.SpringStart.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = "com.SpringStart.Controller.model")
@EnableJpaRepositories("com.SpringStart.Controller.dao")
public class ApplicationConfig {

}
