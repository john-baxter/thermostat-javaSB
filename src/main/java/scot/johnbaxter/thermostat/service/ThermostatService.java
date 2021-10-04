package scot.johnbaxter.thermostat.service;

public interface ThermostatService {
    public void incrementTemperature();
    public void decrementTemperature();
    public void resetDefaultTemperature();
    public void applyFrostProtection();


}
