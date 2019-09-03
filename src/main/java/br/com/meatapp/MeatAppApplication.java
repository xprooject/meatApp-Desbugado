package br.com.meatapp;
 
import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.meatapp.domain.User;
import br.com.meatapp.repository.UserRepository; 

@SpringBootApplication
public class MeatAppApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MeatAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		User user1 = new User(1, "Saulo", "saulon@hot.com", "123");
		User user2 = new User(2, "Saulo", "saulo@gmail.com", "456");
		userRepository.saveAll(Arrays.asList(user1, user2));
	}

}
