package Week3._ParkingManagement.ui;

import Week3._ParkingManagement.beans.Bike;
import Week3._ParkingManagement.beans.Car;
import Week3._ParkingManagement.beans.Vehicle;
import Week3._ParkingManagement.dao.VehicleDaoImpl;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeScreen {

    public static void main(String[] args) {
        int ch; // menu variable

        //vehicle attributes
        String vehicleNo;
        LocalTime entryTime, exitTime;

        //Vehicle registration number format
        Pattern pat = Pattern.compile("^[A-Z]{2}-?\\d{2}-?[A-Z]{2}-?\\d{4}$",Pattern.CASE_INSENSITIVE);
        Scanner sc = new Scanner(System.in);

        //Home-screen data passing Objects
        Vehicle newVehicle;
        VehicleDaoImpl vehicleDao = new VehicleDaoImpl();

        //MainMenu Loop
        do {
            System.out.print("""
                    ---Welcome to ABC Parking Lot---
                    Please select an Option:
                    1. Car
                    2. Bike
                    3. Cycle
                    4. ExitParking
                    9. Close program
                    Enter the option number:""");
            ch = Integer.parseInt(sc.nextLine());
            switch (ch) {
                case 1: //Car
                    System.out.println("Enter the Vehicle Registration no:");
                    vehicleNo = sc.nextLine();
                    Matcher mat = pat.matcher(vehicleNo);
                    if (mat.find()){
                        entryTime = LocalTime.now();
                        newVehicle = new Car(vehicleNo,entryTime);
                        if(vehicleDao.vehicleEntry(newVehicle))
                            System.out.println("Vehicle entry successful. Parking spot :PS"+newVehicle.getSlotNo());
                    }
                    else {
                        System.out.println("Invalid Vehicle Number; enter again!");
                    }
                    break;
                case 2: // Bike
                    System.out.println("Enter the Vehicle Registration no:");
                    vehicleNo = sc.nextLine();
                    mat = pat.matcher(vehicleNo);
                    if (mat.find()){
                        entryTime = LocalTime.now();
                        newVehicle = new Bike(vehicleNo,entryTime);
                        vehicleDao.vehicleEntry(newVehicle);
                    }
                    else {
                        System.out.println("Invalid Vehicle Number; enter again!");
                    }
                    break;
                case 3: //Cycle
                    System.out.println("Please park bicycles in the eco-parking area.");
                    break;
                case 4: //ExitParking
                    System.out.println("Enter the vehicle registration number: ");
                    vehicleNo = sc.nextLine();
                    mat = pat.matcher(vehicleNo);
                    if (mat.find()){
                        exitTime = LocalTime.now();
                        System.out.print("Visit Again. Parking Charges INR:");
                        vehicleDao.vehicleExit(vehicleNo, exitTime);
                    }
                    else {
                        System.out.println("Invalid Vehicle Number.");
                    }
                    break;
                case 9: break; //Exit
                default:
                    System.out.println("Invalid Entry. Please try again!");
            }
        }while (ch!=9);

        System.out.println("Exiting ABC Parking Lot...");
    }
}
