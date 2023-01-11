package Week3.Lab_ParkingManagement.beans;


import Week3.Lab_ParkingManagement.dao.ParkingFull;

import java.time.LocalTime;

public class ParkingLot {
    private final int capacity=20;
    private int count=0;
    Vehicle[] vehicle = new Vehicle[capacity];
    public boolean parkVehicle(Vehicle v) {
       //checking if any previously assigned space is vacated
       for (int slot = 0; slot < count;slot++) {
           if (vehicle[slot] == null) {
                v.setSlotNo(slot);
                vehicle[slot] = v;
                return true;
           }
       }
       //to check if paring is full
       if (count==capacity) throw new ParkingFull("No parking space available!");
       /*if none of the previously assigned space are empty and
       capacity is also not full then
       allot a new space*/
       else{
           v.setSlotNo(count);
           vehicle[count] = v;
           count++;
           return true;
       }
    }
    public void exitVehicle(String vehNo, LocalTime exitTime) {
        for (int slot = 0; slot < count; slot++) {
            if (vehicle[slot].vehicleNo.equals(vehNo)) {
                vehicle[slot].exitTime = exitTime;
                System.out.println(computeCost(vehicle[slot]));
                vehicle[slot] = null;
            }
        }
    }
    public float computeCost(Vehicle v){
        return (v.exitTime.getHour() - v.entryTime.getHour())*v.getCostPerHour();
    }
}
