package Week3._ParkingManagement.beans;


import java.time.LocalTime;

public class ParkingLot {

    Vehicle[] vehicle = new Vehicle[20];
    int count=0;
    public boolean parkVehicle(Vehicle v) {
        if(count < 20){
            v.setSlotNo(count);
            vehicle[count] = v;
            count ++;
            return true;
        }
        else {
            for (int i = 0; i < count;i++) {
                if (vehicle[i].vehicleNo == null) {
                    v.setSlotNo(i);
                    vehicle[i] = v;
                    return true;
                }
            }
        }
        return false;
    }

    public void exitVehicle(String vehNo, LocalTime exitTime) {
        for (int i = 0; i < count; i++) {
            if (vehicle[i].vehicleNo.equals(vehNo)) {
                vehicle[i].exitTime = exitTime;
                System.out.println(computeCost(vehicle[i]));
                vehicle[i] = null;
            }
        }
    }

    public float computeCost(Vehicle v){
        return (v.exitTime.getHour() - v.entryTime.getHour())*v.getCostPerHour();
    }
}
