package Week3._ParkingManagement.ui;

import Week3._ParkingManagement.beans.Bike;
import Week3._ParkingManagement.beans.Car;
import Week3._ParkingManagement.beans.Cycle;
import Week3._ParkingManagement.beans.Vehicle;
import Week3._ParkingManagement.dao.IncorrectVehicleNoFormat;
import Week3._ParkingManagement.dao.NotImplemented;
import Week3._ParkingManagement.dao.ParkingFull;
import Week3._ParkingManagement.dao.VehicleDaoImpl;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeScreen {

    public static void main(String[] args) {
        int ch; // menu variable
        String vehicleNo;
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
            try {
                switch (ch) {
                    case 1: //Car
                        System.out.println("Enter the Car Registration no:");
                        vehicleNo = sc.nextLine();
                        isValidVehicleNo(vehicleNo);
                        newVehicle = new Car(vehicleNo,LocalTime.now());
                        if (vehicleDao.vehicleEntry(newVehicle))
                            System.out.println("Vehicle entry successful. Parking spot :PS" + newVehicle.getSlotNo());
                        break;
                    case 2: // Bike
                        System.out.println("Enter the Bike Registration no:");
                        vehicleNo = sc.nextLine();
                        isValidVehicleNo(vehicleNo);
                        newVehicle = new Bike(vehicleNo, LocalTime.now());
                        if (vehicleDao.vehicleEntry(newVehicle))
                            System.out.println("Vehicle entry successful. Parking spot :PS" + newVehicle.getSlotNo());
                        break;
                    case 3: //Cycle
                        System.out.println("Enter the Cycle Registration no:");
                        vehicleNo = sc.nextLine();
                        isValidVehicleNo(vehicleNo);
                        newVehicle = new Cycle(vehicleNo, LocalTime.now());
                        if (vehicleDao.vehicleEntry(newVehicle))
                            System.out.println("Vehicle entry successful. Parking spot :PS" + newVehicle.getSlotNo());
                        break;
                    case 4: //ExitParking
                        System.out.println("Enter the vehicle registration number: ");
                        vehicleNo = sc.nextLine();
                        isValidVehicleNo(vehicleNo);
                        System.out.print("Visit Again. Parking Charges INR:");
                        vehicleDao.vehicleExit(vehicleNo, LocalTime.now());
                        break;
                    case 9:
                        break; //Exit
                    default:
                        System.out.println("Invalid Entry. Please try again!");
                }
            }catch (IncorrectVehicleNoFormat | NotImplemented | ParkingFull e){
                System.out.println(e.getMessage());
            }
        } while (ch != 9);
        System.out.println("Exiting ABC Parking Lot...");
    }

    public static void isValidVehicleNo(String vehNo) throws IncorrectVehicleNoFormat{
        //Vehicle registration number format
        Pattern pat = Pattern.compile("^[A-Z]{2}-?\\d{2}-?[A-Z]{2}-?\\d{4}$", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(vehNo);
        if(!mat.matches())
            throw new IncorrectVehicleNoFormat("Enter correct vehicle number (AA-00-AA-0000); enter again!");
    }

}
