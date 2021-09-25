package com.spring.actuator.prometheus.springactuatorprometheus;

import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller("/")
public class SpringActuatorPrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorPrometheusApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> test() {
		return ResponseEntity.of(Optional.of("<h1>Olá mundo, de novo!</h1>"));
	}

}
