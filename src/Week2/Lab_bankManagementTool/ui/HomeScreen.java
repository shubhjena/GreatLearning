package Week2.Lab_bankManagementTool.ui;
import Week2.Lab_bankManagementTool.dao.CustomerDaoImpl;
import Week2.Lab_bankManagementTool.dao.EmployeeDaoImpl;

import java.util.*;

public class HomeScreen {

    public static void main(String[] args) {
        int ch = 0;
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("""
                                    
                    ---Welcome to XXX Bank Portal---
                    Please Select an option:
                    1. Bank Employee
                    2. Customer
                    9. Exit
                                   
                    Your Choice: """);
            ch = Integer.parseInt(sc.nextLine());
            try {
                switch (ch) {
                    case 1 ->//Bank Employee
                            BankEmployeeUI.employeeMain(employeeDao);
                    case 2 ->//Customer
                            CustomerUI.customerMain(customerDao);
                    case 9 ->//Exit
                            System.out.println();
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }while (ch!=9);
        System.out.println("\nThank you for using XXX Bank Portal.");
    }
}
