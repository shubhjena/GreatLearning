package Week3_Exception_Handling.Lab_ParkingManagement.beans;

import java.time.LocalTime;

public class Bike extends Vehicle {
    float costPerHour=20;
    public Bike(String vehicleNo, LocalTime entryTime) {
        super(vehicleNo,entryTime);
    }
    public float getCostPerHour() {
        return costPerHour;
    }
}
