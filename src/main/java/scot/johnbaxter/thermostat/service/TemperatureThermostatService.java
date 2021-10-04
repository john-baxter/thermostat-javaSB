package scot.johnbaxter.thermostat.service;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class TemperatureThermostatService implements ThermostatService{

    private Logger log = (Logger) LoggerFactory.getLogger(TemperatureThermostatService.class);

    @Override
    public void incrementTemperature() {
        log.info("Increasing temp");
    }

    @Override
    public void decrementTemperature() {
        log.info("Decreasing temp");
    }

    @Override
    public void resetDefaultTemperature() {
        log.info("Setting default temp");
    }

    @Override
    public void applyFrostProtection() {
        log.info("Setting frost protection temp");
    }
}
