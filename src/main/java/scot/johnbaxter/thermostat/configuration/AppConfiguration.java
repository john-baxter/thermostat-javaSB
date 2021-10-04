package scot.johnbaxter.thermostat.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import scot.johnbaxter.thermostat.service.TemperatureThermostatService;
import scot.johnbaxter.thermostat.service.ThermostatService;

@Configuration
public class AppConfiguration {

    @Bean
    public ThermostatService temperatureThermostatServiceConfiguration() {
        return new TemperatureThermostatService();
    }
}
