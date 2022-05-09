package hugoAPI.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "flight")
public class FlightModel {

    @Id
    @Column(name = "flight_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private Integer flightCapacity;

    @Column(nullable = false, length = 50)
    private String flightNumber;

    @Column(nullable = false, length = 50)
    private String mfdBy;

    @Column(nullable = false)
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
        FlightModel that = (FlightModel) o;
        return getId().equals(that.getId())
                && getFlightCapacity().equals(that.getFlightCapacity())
                && getFlightNumber().equals(that.getFlightNumber())
                && getMfdBy().equals(that.getMfdBy())
                && getMfdOn().equals(that.getMfdOn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFlightCapacity(), getFlightNumber(), getMfdBy(), getMfdOn());
    }

    @Override
    public String toString() {
        return "FlightModel{" +
                "id=" + id +
                ", flightCapacity=" + flightCapacity +
                ", flightNumber='" + flightNumber + '\'' +
                ", mfdBy='" + mfdBy + '\'' +
                ", mfdOn=" + mfdOn +
                '}';
    }
}
