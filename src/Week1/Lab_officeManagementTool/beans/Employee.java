package Week1.Lab_officeManagementTool.beans;

import java.util.Scanner;

public class Employee extends Company{

    String employeeId, name, managerId, teamName;

    @Override
    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID:");
        this.employeeId = sc.next();
        System.out.print("Enter Name:");
        this.name = sc.next();
        System.out.print("Manager ID:");
        this.managerId  = sc.next();
        System.out.print("Enter team name:");
        this.teamName = sc.next();
        sc.close();
    }

    @Override
    public void getData() {
        System.out.println("\nEmployee ID: "+ this.employeeId);
        System.out.println("Name: "+this.name);
        System.out.println("Manager ID: "+this.managerId);
        System.out.println("Team Name: "+ this.teamName);
    }
}
