package Week2.Lab_bankManagementTool.ui;
import java.util.*;

public class HomeScreen {

    public static void main(String[] args) {
        int ch=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                ---Welcome to XXX Bank Portal---
                Please Select an option:
                1. Bank Employee
                2. Customer
                9. Exit
                
                Your Choice: """);
        ch = sc.nextInt();

        switch (ch){
            case 1:
            case 2:
            case 9:
        }

    }
}
