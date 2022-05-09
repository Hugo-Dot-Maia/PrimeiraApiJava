package hugoAPI.demo.repository;

import hugoAPI.demo.model.FlightModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightRepository extends CrudRepository<FlightModel,Integer> {
}
