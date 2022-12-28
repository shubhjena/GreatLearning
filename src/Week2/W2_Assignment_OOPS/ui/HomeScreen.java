package Week2.W2_Assignment_OOPS.ui;
import Week2.W2_Assignment_OOPS.beans.*;
import Week2.W2_Assignment_OOPS.dao.ShapeDao;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class HomeScreen {
    public static void main(String[] args) {
        ShapeDao sDao = new ShapeDao();
        Shape[] sh = new Shape[4];
        Scanner sc = new Scanner(System.in);
        int ch=0;
        while(ch!=9) {
            System.out.print("""
                    
                    Welcome to Mensuration Assistant
                    
                    Please select an shape to begin:
                    1. Circle
                    2. Rectangle
                    3. Square
                    4. Triangle
                    9. Exit
                    Enter your choice here: """);
            ch = sc.nextInt();
            switch(ch){
                case 1: //Circle
                    Circle circle = new Circle();
                    System.out.println("\n---Circle---");
                    System.out.print("Enter the radius of the circle: ");
                    circle.setRadius(sc.nextDouble());
                    sDao.displayDetails(circle);
                    sDao.getPerimeter(circle);
                    sDao.getArea(circle);
                    break;

                case 2://Rectangle
                    Rectangle rect = new Rectangle();
                    System.out.println("\n---Rectangle---");
                    System.out.print("Enter the length of Rectangle: ");
                    rect.setLength(sc.nextDouble());
                    System.out.print("Enter the breadth of Rectangle: ");
                    rect.setBreadth(sc.nextDouble());
                    sDao.displayDetails(rect);
                    sDao.getPerimeter(rect);
                    sDao.getArea(rect);
                    break;

                case 3://Square
                    Square sqr = new Square();
                    System.out.println("---Square---");
                    System.out.print("Enter the side of square: ");
                    sqr.setSide(sc.nextDouble());
                    sDao.displayDetails(sqr);
                    sDao.getPerimeter(sqr);
                    sDao.getArea(sqr);
                    break;

                case 4://Triangle
                    Triangle tri = new Triangle();
                    System.out.println("\n---Triangle---");
                    System.out.println("Enter side 1: ");
                    tri.setSide1(sc.nextDouble());
                    System.out.println("Enter side 2: ");
                    tri.setSide2(sc.nextDouble());
                    System.out.println("Enter side 3: ");
                    tri.setSide3(sc.nextDouble());
                    sDao.displayDetails(tri);
                    sDao.getPerimeter(tri);
                    sDao.getArea(tri);
                    break;

                case 9: break; //Exit
                default:
                    System.out.println("Invalid Choice. Please try again!");
            }
        }
    }
 }
