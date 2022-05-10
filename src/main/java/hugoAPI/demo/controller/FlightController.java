package hugoAPI.demo.controller;


import hugoAPI.demo.DataTranferObjects.FlightDTO;
import hugoAPI.demo.Iservice.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlightController {

    @Autowired
    IFlightService flightService;

    @GetMapping (path = "/api/flight/getFlight/{id}")
    public FlightDTO getFlight(@PathVariable("id") Integer id){
        return flightService.getFlight(id);
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
