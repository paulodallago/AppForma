package com.appforma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AppFormaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppFormaApiApplication.class, args);
	}

}
