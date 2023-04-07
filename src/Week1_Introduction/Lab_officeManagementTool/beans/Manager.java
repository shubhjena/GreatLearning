package Week1_Introduction.Lab_officeManagementTool.beans;

import java.util.Scanner;

public class Manager extends Company{
    String id, name, department;
    int noOfTeammates;
    @Override
    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager ID:");
        this.id = sc.next();
        System.out.print("Enter Name:");
        this.name = sc.next();
        System.out.print("Enter Department:");
        this.department  = sc.next();
        System.out.print("Enter number of teammates:");
        this.noOfTeammates = sc.nextInt();
        sc.close();
    }
    public void getData() {
        System.out.println("\nManager ID:"+ this.id);
        System.out.println("Name:"+ this.name);
        System.out.println("Department:"+ this.department);
        System.out.println("Number of teammates:"+ this.noOfTeammates);
    }
}
