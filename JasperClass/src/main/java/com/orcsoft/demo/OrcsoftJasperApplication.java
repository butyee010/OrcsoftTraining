package com.orcsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
	"com.orcsoft.demo"
})
public class OrcsoftJasperApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrcsoftJasperApplication.class, args);
	}
}
