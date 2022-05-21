package hugoAPI.demo.Iservice;

import hugoAPI.demo.DataTranferObjects.FlightDTO;
import hugoAPI.demo.model.FlightModel;

import java.util.List;
import java.util.Map;

public interface IFlightService {
     FlightDTO saveFlight(FlightDTO flightDTO);

     FlightDTO getFlight(Integer id);

     FlightDTO updateFlight(FlightDTO flightDTO);

     void deleteFlight(Integer id);

     List<FlightDTO> getAllFlights();

     Map<String, List<FlightModel>> getAllFlightsByManufacture();
}
