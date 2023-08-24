package Week3_Exception_Handling.Lab_ParkingManagement.dao;

public class NotImplemented extends RuntimeException {
    public NotImplemented(String message) {
        super(message);
    }
}
