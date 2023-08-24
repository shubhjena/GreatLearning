package Week1_Introduction.Lab_officeManagementTool.dao;
import Week1_Introduction.Lab_officeManagementTool.beans.ManagerBean;

import java.util.Scanner;

public class ManagerDao {
    public static String password="Admin";

    //to set up ManagerBean instances
    public static void managerSetData(ManagerBean manager){
        Scanner sc= new Scanner(System.in);
        System.out.println("-----Enter Manager Details-----");
        System.out.print("Enter the ID: ");
        manager.setId(sc.nextLine());
        System.out.print("Enter the Name: ");
        manager.setName(sc.nextLine());
        System.out.print("Enter the Department: ");
        manager.setDepartment(sc.nextLine());
        System.out.print("Enter the number of Teammates: ");
        manager.setNoOfTeammates(sc.nextInt());
    }
    //to view ManagerBean instances
    public static void managerGetData(ManagerBean manager){
        System.out.println("-----Showing Manager Details-----");
        System.out.println("ID: "+manager.getId());
        System.out.println("Name: "+manager.getName());
        System.out.println("Department: "+manager.getDepartment());
        System.out.println("No of Teammates: "+manager.getNoOfTeammates());
        System.out.println("---------------------------------");

    }


}
