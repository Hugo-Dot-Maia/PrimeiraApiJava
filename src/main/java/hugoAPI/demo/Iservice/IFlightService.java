package hugoAPI.demo.Iservice;

import hugoAPI.demo.DataTranferObjects.FlightDTO;

import java.util.List;

public interface IFlightService {
     FlightDTO saveFlight(FlightDTO flightDTO);

     FlightDTO getFlight(Integer id);

     FlightDTO updateFlight(FlightDTO flightDTO);

     void deleteFlight(Integer id);

     List<FlightDTO> getAllFlights();
}
