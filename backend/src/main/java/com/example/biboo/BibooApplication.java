package com.example.biboo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BibooApplication {

	public static void main(String[] args) {

		SpringApplication.run(BibooApplication.class, args);

	}

	@GetMapping("/books")
	public String books(@RequestParam(value="book", defaultValue="Miss Peregrine") String book) {
		return String.format("Hello %s!", book);
	}

}
