package co.edu.escuelaing.workshop2;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop2Application {

	public static void main(String[] args) {
		SpringApplication application =
				new SpringApplication(Workshop2Application.class);

		application.setDefaultProperties(
				Map.of("server.port",
						System.getenv().getOrDefault("PORT", "6000")));

		application.run(args);
	}
}