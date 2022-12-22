package Week1.Lab_officeManagementTool.in;
import Week1.Lab_officeManagementTool.dao.EmployeeDao;
import Week1.Lab_officeManagementTool.dao.ManagerDao;
import Week1.Lab_officeManagementTool.beans.EmployeeBean;
import Week1.Lab_officeManagementTool.beans.ManagerBean;

import  java.util.*;
public class Main {
    public static void main(String[] args) {
        int choice;
        System.out.println("Welcome to office management tool");
        Scanner sc = new Scanner(System.in); //scanner class to get user choice

        //Bean objects being passed to DAO
        ManagerBean manager = new ManagerBean();
        EmployeeBean employee = new EmployeeBean();

        //Iteration of UI Menu
        do{ //Level 1
            System.out.print("""

                    Choose Your Option:\s
                    Manager  --> 1
                    Employee --> 2
                    Terminate--> 9
                    Input here :\s""");
            choice = sc.nextInt();

            //Level 2
            //Manager Menu
            if(choice==1){
                System.out.print("Enter Password to Access Manager Menu:");
                sc.nextLine();
                if(!sc.nextLine().equals(ManagerDao.password)){
                    System.out.println("Incorrect Password");
                    break;}
                System.out.println("""
                        
                        -----Manager Module-----
                        Please enter the function:
                        Add manager --> 1
                        View details--> 2
                        Exit        --> 9
                        Function    -->""");
                switch (sc.nextInt()){
                    case 1: ManagerDao.managerSetData(manager);
                            break;
                    case 2: ManagerDao.managerGetData(manager);
                            break;
                    case 9: break;
                    default:System.out.println("Invalid Input");
                }
                System.out.println("\nFunction Completed. Returning to Main Menu.");
            }
            //Employee Menu
            else if (choice ==2) {
                    System.out.println("""
                        
                        -----Employee Module-----
                        Please select a function:
                        Add Employee--> 1
                        View details--> 2
                        Exit        --> 9
                        Function    -->""");
                switch (sc.nextInt()) {
                    case 1: EmployeeDao.employeeSetData(employee);
                            break;
                    case 2: EmployeeDao.employeeGetData(employee);
                            break;
                    case 9: break;
                    default: System.out.println("Invalid Input");
                }
                System.out.println("\nFunction Completed. Returning to Main Menu.");
            }

        }while(choice!=9);

        System.out.println("\nThank you for using office management tool");
    }
}