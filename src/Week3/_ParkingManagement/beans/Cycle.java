package Week3._ParkingManagement.beans;

import Week3._ParkingManagement.dao.NotImplemented;

import java.time.LocalTime;

public class Cycle extends Vehicle{
    public Cycle(String vehicleNo, LocalTime entryTime){
        super(vehicleNo,entryTime);
        throw new NotImplemented("Please park bicycles in the eco-parking area.");
    }

    @Override
    float getCostPerHour() {
        return 0;
    }
}
