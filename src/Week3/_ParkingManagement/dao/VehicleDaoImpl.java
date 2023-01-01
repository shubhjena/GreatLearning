package Week3._ParkingManagement.dao;

import Week3._ParkingManagement.beans.ParkingLot;
import Week3._ParkingManagement.beans.Vehicle;

import java.time.LocalTime;

public class VehicleDaoImpl implements VehicleDao{

    ParkingLot parkingLot = new ParkingLot();

    @Override
    public boolean vehicleEntry(Vehicle v) {
    return parkingLot.parkVehicle(v);
    }
    @Override
    public void vehicleExit(String vehNo, LocalTime exitTime) {
    parkingLot.exitVehicle(vehNo,exitTime);
    }

    @Override
    public void computeCost() {
    //to check the parking charges for a specified time
    }
}
