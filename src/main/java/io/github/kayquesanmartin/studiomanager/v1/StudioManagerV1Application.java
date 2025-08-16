package io.github.kayquesanmartin.studiomanager.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StudioManagerV1Application {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(StudioManagerV1Application.class, args);
	}

}
