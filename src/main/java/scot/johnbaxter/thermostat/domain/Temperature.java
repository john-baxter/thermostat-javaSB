package scot.johnbaxter.thermostat.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private final Integer defaultTemperature = 18;
    private final Integer frostProtectionTemperature = 5;
    private final Integer incrementValue = 1;
    private static Integer temperature;

//    no args constructor
    @Autowired
    public Temperature() {
    }

//    with args constructor
    public Temperature(Integer temperature) {
        this.temperature = defaultTemperature;
    }

//    @Bean
//    public Temperature returnTemperatureInstance() {
//        Temperature temperature = new Temperature();
//        return temperature;
//    }

    public void incrementTemperature() {
         this.temperature += incrementValue;
    }

    public void decrementTemperature() {
         this.temperature -= incrementValue;
    }

    public void resetDefaultTemperature() {
         this.temperature = defaultTemperature;
    }

    public void applyFrostProtection() {
         this.temperature = frostProtectionTemperature;
    }

//    getter
    public Integer getTemperature() {
        return temperature;
    }

//    setter
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Temperature that = (Temperature) o;

        return temperature != null ? temperature.equals(that.temperature) : that.temperature == null;
    }

    @Override
    public int hashCode() {
        return temperature != null ? temperature.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature=" + temperature +
                '}';
    }
}
