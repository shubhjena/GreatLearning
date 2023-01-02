package Week3.Lab_ParkingManagement.dao;

import Week3.Lab_ParkingManagement.beans.Vehicle;
import java.time.LocalTime;

public interface VehicleDao {
    boolean vehicleEntry(Vehicle v);
    void vehicleExit(String vehNo, LocalTime exitTime);

}
