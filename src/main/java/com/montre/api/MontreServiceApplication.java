package com.montre.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@SpringBootApplication
public class MontreServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MontreServiceApplication.class, args);
	}
}

@RestController
class MontreController {
	@GetMapping("/montres")
	public List<String> getMontres() {
		return List.of("Rolex Daytona", "Patek Philippe Nautilus", "Audemars Piguet Royal Oak");
	}
}