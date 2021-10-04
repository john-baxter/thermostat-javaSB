package scot.johnbaxter.thermostat.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import scot.johnbaxter.thermostat.domain.Temperature;

@Component
public class BootstrapData implements CommandLineRunner {

    private final Temperature temperature;

//    @Bean
    public BootstrapData(Temperature temp) {
        this.temperature = temp;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in bootstrap");





    }
}
