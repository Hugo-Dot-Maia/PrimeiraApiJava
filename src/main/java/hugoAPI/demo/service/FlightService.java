package hugoAPI.demo.service;

import hugoAPI.demo.DataTranferObjects.FlightDTO;
import hugoAPI.demo.Iservice.IFlightService;
import hugoAPI.demo.model.FlightModel;
import hugoAPI.demo.repository.IFlightRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightService implements IFlightService {

    @Autowired
    IFlightRepository flightRepository;


    public FlightDTO saveFlight(FlightDTO flightDTO) {

        var flightModel = new FlightModel();

        BeanUtils.copyProperties( flightDTO, flightModel);

        flightModel = flightRepository.save(flightModel);

        BeanUtils.copyProperties( flightModel, flightDTO);

        return flightDTO;
    }


    public FlightDTO getFlight(Integer id) {

       Optional<FlightModel> flightModelOptional = flightRepository.findById(id);

       FlightDTO flightDTO = null;
       if(flightModelOptional.isPresent()){
           flightDTO = new FlightDTO();
           BeanUtils.copyProperties( flightModelOptional.get(), flightDTO);
       }

        return flightDTO;
    }

    @Override
    public FlightDTO updateFlight(FlightDTO flightDTO) {
        Optional<FlightModel> flightModelOptional = flightRepository.findById(flightDTO.getId());

        if(flightModelOptional.isPresent()){
            var flightModel = new FlightModel();
            BeanUtils.copyProperties(flightDTO, flightModel);

            flightModel = flightRepository.save(flightModel);

            BeanUtils.copyProperties(flightModel, flightDTO);
        }else {
            //TODO trow exception
        }

        return flightDTO;
    }

    @Override
    public void deleteFlight(Integer id) {

        Optional<FlightModel> flightModelOptional = flightRepository.findById(id);

        if(flightModelOptional.isPresent()){
            flightRepository.deleteById(id);
        }else {
            //TODO trow exception
        }

    }
}
