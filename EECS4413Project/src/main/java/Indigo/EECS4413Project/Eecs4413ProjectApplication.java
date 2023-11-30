package Indigo.EECS4413Project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Eecs4413ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eecs4413ProjectApplication.class, args);
	}

}

