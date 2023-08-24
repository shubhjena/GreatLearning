package Week3_Exception_Handling.Lab_ParkingManagement.dao;

public class IncorrectVehicleNoFormat extends RuntimeException{

    public IncorrectVehicleNoFormat(String message) {
        super(message);
    }
}



