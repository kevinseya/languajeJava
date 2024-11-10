package com.despliegueJava.languajeJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.despliegueJava")
public class LanguajeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguajeJavaApplication.class, args);
	}

}
