package hugoAPI.demo.DataTranferObjects;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Objects;

public class FlightDTO {

    private Integer id;
    private Integer flightCapacity;
    private String flightNumber;
    private String mfdBy;

    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate mfdOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(Integer flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMfdBy() {
        return mfdBy;
    }

    public void setMfdBy(String mfdBy) {
        this.mfdBy = mfdBy;
    }

    public LocalDate getMfdOn() {
        return mfdOn;
    }

    public void setMfdOn(LocalDate mfdOn) {
        this.mfdOn = mfdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDTO flightDTO = (FlightDTO) o;
        return getId().equals(flightDTO.getId())
                && getFlightCapacity().equals(flightDTO.getFlightCapacity())
                && getFlightNumber().equals(flightDTO.getFlightNumber())
                && getMfdBy().equals(flightDTO.getMfdBy())
                && getMfdOn().equals(flightDTO.getMfdOn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFlightCapacity(), getFlightNumber(), getMfdBy(), getMfdOn());
    }

    @Override
    public String toString() {
        return "FlightDTO{" +
                "id=" + id +
                ", flightCapacity=" + flightCapacity +
                ", flightNumber='" + flightNumber + '\'' +
                ", mfdBy='" + mfdBy + '\'' +
                ", mfdOn=" + mfdOn +
                '}';
    }
}
