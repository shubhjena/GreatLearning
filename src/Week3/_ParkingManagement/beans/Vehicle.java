package Week3._ParkingManagement.beans;
import java.time.LocalTime;


public abstract class Vehicle {
    String vehicleNo;
    LocalTime entryTime, exitTime;
    int slotNo;

    public Vehicle(String vehicleNo, LocalTime entryTime){
        this.vehicleNo = vehicleNo;
        this.entryTime = entryTime;
        this.exitTime = entryTime;
    }

    public int getSlotNo() {
        return slotNo;
    }
    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    abstract float getCostPerHour();
}
