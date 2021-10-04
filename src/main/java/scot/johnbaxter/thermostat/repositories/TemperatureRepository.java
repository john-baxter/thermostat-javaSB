package scot.johnbaxter.thermostat.repositories;

import org.springframework.data.repository.CrudRepository;
import scot.johnbaxter.thermostat.domain.Temperature;

public interface TemperatureRepository extends CrudRepository<Temperature, Long> {
}
