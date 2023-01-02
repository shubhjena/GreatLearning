package Week3._ParkingManagement.dao;

import Week3._ParkingManagement.beans.Vehicle;
import java.time.LocalTime;

public interface VehicleDao {
    boolean vehicleEntry(Vehicle v);
    void vehicleExit(String vehNo, LocalTime exitTime);

}
