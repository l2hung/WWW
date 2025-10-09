package tuan7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tuan7.service.EmployeeService;

@SpringBootApplication
public class Tuan7Application {

	public static void main(String[] args) {
		SpringApplication.run(Tuan7Application.class, args);
	}

	@Bean
	CommandLineRunner run(EmployeeService service) {
		return args -> {
			service.demo();
		};
	}
}
