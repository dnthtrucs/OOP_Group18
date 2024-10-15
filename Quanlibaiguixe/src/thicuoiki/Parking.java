package thicuoiki;

import java.time.LocalDate;

public class Parking {
    private String name;
    private String carId;
    private LocalDate timeIn;
    private LocalDate timeOut;

    public Parking() {
    }

    public Parking(String name, String carId, LocalDate timeIn, LocalDate timeOut) {
        this.name = name;
        this.carId = carId;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public LocalDate getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDate timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDate getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDate timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", carId='" + carId + '\'' +
                ", timeIn=" + timeIn +
                ", timeOut=" + timeOut +
                '}';
    }
}
