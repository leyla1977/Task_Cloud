package ru.netology.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run( SpringBootDemoApplication.class, args);
	}

}
