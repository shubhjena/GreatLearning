package Week1.W1_OOPS_Shapes.dao;

import Week1.W1_OOPS_Shapes.beans.Rectangle;

import java.util.Scanner;

public class RectangleDao{

    public static void setDimensions(Rectangle rectangle) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle(mm): ");
        rectangle.setHeight(sc.nextDouble());
        System.out.print("Enter the width of the rectangle(mm): ");
        rectangle.setWidth(sc.nextDouble());
        sc.close();
    }

    public static void getDetails(Rectangle rectangle){
        rectangle.displayDetails();
    }
}
