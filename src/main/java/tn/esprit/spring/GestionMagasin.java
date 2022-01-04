package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionMagasin {

	public static void main(String[] args) {

		SpringApplication.run(GestionMagasin.class, args);
	}

	/*@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			User mariem = new User(
					"Mariem",
					"BOKRI",
					"mariem.bokri@esprit.tn",
					23
			);
			studentRepository.save(mariem);
		};
	}*/


}
