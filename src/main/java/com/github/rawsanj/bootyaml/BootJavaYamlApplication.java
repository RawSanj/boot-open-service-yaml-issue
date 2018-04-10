package com.github.rawsanj.bootyaml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootJavaYamlApplication implements ApplicationRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(BootJavaYamlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BootJavaYamlApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		LOGGER.info("Application Started............!");

	}
}
