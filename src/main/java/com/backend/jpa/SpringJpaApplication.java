package com.backend.jpa;

import com.backend.jpa.models.Author;
import com.backend.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}


	//@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository
	) {
		return args -> {
			var author = Author.builder()
				.firstName("Juldas")
				.lastName("RAMDE")
				.age(22)
				.email("dev@junior.com")
				.build();

			authorRepository.save(author);
		};
	}
}

























