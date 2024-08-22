package com.martinada.personal_blog_api.service;

import com.martinada.personal_blog_api.model.Address;
import com.martinada.personal_blog_api.model.User;
import com.martinada.personal_blog_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.martinada.personal_blog_api.repository")
@SpringBootApplication
public class PersonalBlogApiApplication {

	private final UserRepository userRepository;

	@Autowired
    public PersonalBlogApiApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(PersonalBlogApiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return args -> {
			Address address = new Address(
					"32shd",
					"charlton",
					"london",
					"england",
					"e14");
			User user = new User(
					"Martin",
					"Adara",
					"Adara",
					"ma@mail.com",
					address
			);


			repository.insert(user);
		};
	}
}
