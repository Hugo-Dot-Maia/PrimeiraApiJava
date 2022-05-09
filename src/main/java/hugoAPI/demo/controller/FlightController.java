package hugoAPI.demo.controller;


import hugoAPI.demo.DataTranferObjects.FlightDTO;
import hugoAPI.demo.Iservice.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlightController {

    @Autowired
    IFlightService flightService;

    @GetMapping (path = "/api/flight/getFlight")
    public String getFlight(){
        return "test";
    }

    @PostMapping (path = "/api/flight/createFlight")
    public FlightDTO createFlight(@RequestBody FlightDTO flightDTO) {
        return flightService.saveFlight(flightDTO);
    }

    @PutMapping (path = "/api/flight/updateFlight")
    public String updateFlight(){
        return "test";
    }

    @DeleteMapping (path = "/api/flight/deleteFlight")
    public String deleteFlight(){
        return "test";
    }
}
