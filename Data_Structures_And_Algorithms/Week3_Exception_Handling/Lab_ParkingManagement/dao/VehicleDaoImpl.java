package Week3_Exception_Handling.Lab_ParkingManagement.dao;

import Week3_Exception_Handling.Lab_ParkingManagement.beans.ParkingLot;
import Week3_Exception_Handling.Lab_ParkingManagement.beans.Vehicle;

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
}
