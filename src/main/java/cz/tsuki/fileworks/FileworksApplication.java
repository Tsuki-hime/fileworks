package cz.tsuki.fileworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileworksApplication.class, args);

		System.out.println("Hello there!");
	}

}
