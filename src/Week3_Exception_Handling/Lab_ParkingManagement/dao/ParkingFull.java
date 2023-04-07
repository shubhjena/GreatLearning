package Week3_Exception_Handling.Lab_ParkingManagement.dao;

public class ParkingFull extends RuntimeException{
    public ParkingFull(String message) {
        super(message);
    }
}
