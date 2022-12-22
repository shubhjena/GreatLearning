package Week1.W1_OOPS_Shapes.dao;

import Week1.W1_OOPS_Shapes.beans.Circle;

import java.util.Scanner;

public class CircleDao {
    public static void setDimensions(Circle circle){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle(mm): ");
        circle.setRadius(sc.nextDouble());
        sc.close();
    }

    public static void getDetails(Circle circle){
        circle.displayDetails();
    }
}
