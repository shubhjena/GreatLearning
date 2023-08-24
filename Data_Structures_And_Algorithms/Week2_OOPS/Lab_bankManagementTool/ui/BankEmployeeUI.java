package Week2_OOPS.Lab_bankManagementTool.ui;

import Week2_OOPS.Lab_bankManagementTool.beans.Employee;
import Week2_OOPS.Lab_bankManagementTool.dao.EmployeeDaoImpl;

import java.util.*;

public class BankEmployeeUI {
    public static void employeeMain(EmployeeDaoImpl employeeDao) {
        String name, empCode;
        long phoneNo;
        Employee employee;
        Scanner sc = new Scanner(System.in);
        //Bank Employee
        System.out.print("""
                
                ---Bank Employee---
                1. New Employee
                2. View Employee Details
                9. Cancel
                                    
                Your choice: """);
        int ch = Integer.parseInt(sc.nextLine());
        try {
            switch (ch) {
                case 1://new employee
                    System.out.println("---New Employee Registration---");
                    System.out.print("Enter name of employee: ");
                    name = sc.nextLine();
                    System.out.print("Enter employee code:");
                    empCode = sc.nextLine();
                    System.out.print("Enter phone number:");
                    phoneNo = Long.parseLong(sc.nextLine());
                    employee = new Employee(name,empCode,phoneNo);
                    if(employeeDao.addNewEmployee(employee))
                        System.out.println("New employee added to the directory.");
                    employeeDao.displayEmployeeInfo(empCode);
                    break;

                case 2://View Employee Details
                    System.out.print("Enter Employee code:");
                    empCode = sc.nextLine();
                    employeeDao.displayEmployeeInfo(empCode);
                    break;
                case 9://Cancel
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Employee directory full. Contact admin team.");
        }catch (NullPointerException e){
            System.out.println("Employee not found in the directory!");
        }catch (Exception e){
            e.getMessage();
        }
    }
}
