package com.company.Frontend;

import com.company.Frontend.DAO.UserRepository;
import com.company.Frontend.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Thevindu","Rajapakse","thevinduraja@gmail.com"));
		userRepository.save(new User("Pasindu","Peiris","pasindupeiris@gmail.com"));
		userRepository.save(new User("Hamza","Hassan","hamzahassan@gmail.com"));
		userRepository.save(new User("Vihanga","Fernando","vihangafernando@gmail.com"));
	}
}
