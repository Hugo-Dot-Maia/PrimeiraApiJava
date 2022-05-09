package hugoAPI.demo.service;

import hugoAPI.demo.DataTranferObjects.FlightDTO;
import hugoAPI.demo.Iservice.IFlightService;
import hugoAPI.demo.model.FlightModel;
import hugoAPI.demo.repository.IFlightRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FlightService implements IFlightService {

    @Autowired
    IFlightRepository flightRepository;


    public FlightDTO saveFlight(FlightDTO flightDTO) {

        FlightModel flightModel = new FlightModel();

        BeanUtils.copyProperties( flightDTO, flightModel);

        flightModel = flightRepository.save(flightModel);

        BeanUtils.copyProperties( flightModel, flightDTO);

        return flightDTO;
    }
}
