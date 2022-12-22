package Week1.Lab_officeManagementTool.dao;
import Week1.Lab_officeManagementTool.beans.EmployeeBean;
import java.util.Scanner;

public class EmployeeDao {
    public static void employeeSetData(EmployeeBean employee){
        Scanner sc= new Scanner(System.in);
        System.out.println("-----Enter Employee Details-----");
        System.out.print("Enter the ID: ");
        employee.setEmployeeId(sc.nextLine());
        System.out.print("Enter the Name: ");
        employee.setName(sc.nextLine());
        System.out.print("Enter the ManagerID: ");
        employee.setManagerId(sc.nextLine());
        System.out.print("Enter the number of team name: ");
        employee.setTeamName(sc.nextLine());
    }
    //to view ManagerBean instances
    public static void employeeGetData(EmployeeBean employee){
        System.out.println("-----Showing Manager Details-----");
        System.out.println("ID: "+employee.getEmployeeId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Manager ID: "+employee.getManagerId());
        System.out.println("No of Team name: "+employee.getTeamName());
        System.out.println("---------------------------------");
    }

}
