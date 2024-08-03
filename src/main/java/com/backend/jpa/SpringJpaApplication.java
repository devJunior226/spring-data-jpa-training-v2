package com.backend.jpa;

import com.backend.jpa.models.Author;
import com.backend.jpa.models.Video;
import com.backend.jpa.repositories.AuthorRepository;
import com.backend.jpa.repositories.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository,
		VideoRepository videoRepository
	) {
		return args -> {
			for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();

				var author = Author.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.age(faker.number().numberBetween(19, 50))
					//.email("devjunior" +i + "@gmail.com")
					.email(faker.internet().emailAddress())
					//.email(faker.name().username() + "@dev.com")
					.build();

				//authorRepository.save(author);
			}

			// Update author with id = 1
			var author = Author.builder()
				.id(1)
				.firstName("Juldas")
				.lastName("RAMDE")
				.age(21)
				.email("devjunior@ramde.com")
				.build();
			//authorRepository.save(author);

			// update Author a set a.age = 22 where a.id = 1
			//authorRepository.updateAuthor(22, 1);

			// update all ages
			//authorRepository.updateAllAuthorAges(34);

			// find by named query
			authorRepository.findByNamedQuery(22)
				.forEach(System.out::println);


			// update firstname
			authorRepository.updateAuthorAgeByNamedQuery(100);

		};


	}
}

























