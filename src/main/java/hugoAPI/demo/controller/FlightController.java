package hugoAPI.demo.controller;


import hugoAPI.demo.DataTranferObjects.FlightDTO;
import hugoAPI.demo.Iservice.IFlightService;
import hugoAPI.demo.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class FlightController {

    @Autowired
    IFlightService flightService;

    @GetMapping (path = "/api/flight/getFlight/{id}")
    public FlightDTO getFlight(@PathVariable("id") Integer id){
        return flightService.getFlight(id);
    }

    @GetMapping (path = "/api/flight/getAllFlights")
    public List<FlightDTO> getAllFlights(){
        return flightService.getAllFlights();
    }

    @GetMapping (path = "/api/flight/getAllFlightsByManufacture")
    public Map<String, List<FlightModel>> getAllFlightsByManufacture(){
        return flightService.getAllFlightsByManufacture();
    }

    @GetMapping("/api/flight/getFlightCapacityByInterval/{date}")
    public Map<String, Integer > getFlightCapacityByInterval(
            @PathVariable("date")
            @DateTimeFormat(pattern = "MM/dd/yyyy") Date date){
            return flightService.getFlightCapacityByInterval(date);
    }

    @PostMapping (path = "/api/flight/createFlight")
    public FlightDTO createFlight(@RequestBody FlightDTO flightDTO) {
        return flightService.saveFlight(flightDTO);
    }

    @PutMapping (path = "/api/flight/updateFlight")
    public FlightDTO updateFlight(@RequestBody FlightDTO flightDTO){
        return flightService.updateFlight(flightDTO);
    }

    @DeleteMapping (path = "/api/flight/deleteFlight/{id}")
    public void deleteFlight(@PathVariable("id") Integer id){
        flightService.deleteFlight(id);
    }
}
