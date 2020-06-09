package com.uday.springReadFromConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ReadFromConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadFromConfigServerApplication.class, args);
	}

}
