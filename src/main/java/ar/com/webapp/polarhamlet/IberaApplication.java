package ar.com.webapp.polarhamlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IberaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IberaApplication.class, args);
	}
}
