package scot.johnbaxter.thermostat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThermostatChallengeApplication {

	@Bean
	public static void main(String[] args) {
		SpringApplication.run(ThermostatChallengeApplication.class, args);
	}

}
