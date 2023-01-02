package Week3.Lab_ParkingManagement.beans;


import Week3.Lab_ParkingManagement.dao.ParkingFull;

import java.time.LocalTime;

public class ParkingLot {
    private final int capacity=20;
    private int count=0;
    Vehicle[] vehicle = new Vehicle[capacity];
    public boolean parkVehicle(Vehicle v) {
       for (int i = 0; i < count;i++) {
           if (vehicle[i] == null) {
                v.setSlotNo(i);
                vehicle[i] = v;
                return true;
           }
       }
       if (count==capacity) throw new ParkingFull("No parking space available!");
       else{
           v.setSlotNo(count);
           vehicle[count] = v;
           count++;
           return true;
       }
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
