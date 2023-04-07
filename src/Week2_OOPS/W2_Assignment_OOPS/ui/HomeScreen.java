package Week2_OOPS.W2_Assignment_OOPS.ui;
import Week2_OOPS.W2_Assignment_OOPS.beans.*;
import Week2_OOPS.W2_Assignment_OOPS.dao.ShapeDao;

import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) {
        ShapeDao sDao = new ShapeDao();
        Scanner sc = new Scanner(System.in);
        int ch=0;
        System.out.println("\nWelcome to Mensuration Assistant");
        while(ch!=9) {
            System.out.print("""
                    
                    Please select an shape to begin:
                    1. Circle
                    2. Rectangle
                    3. Square
                    4. Triangle
                    9. Exit
                    Enter your choice here:\040""");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> { //Circle
                    Circle circle = new Circle();
                    System.out.println("\n---Circle---");
                    System.out.print("Enter the radius of the circle: ");
                    circle.setRadius(sc.nextDouble());
                    sDao.displayDetails(circle);
                    sDao.getPerimeter(circle);
                    sDao.getArea(circle);
                }
                case 2 -> {//Rectangle
                    Rectangle rect = new Rectangle();
                    System.out.println("\n---Rectangle---");
                    System.out.print("Enter the length of Rectangle: ");
                    rect.setLength(sc.nextDouble());
                    System.out.print("Enter the breadth of Rectangle: ");
                    rect.setBreadth(sc.nextDouble());
                    sDao.displayDetails(rect);
                    sDao.getPerimeter(rect);
                    sDao.getArea(rect);
                }
                case 3 -> {//Square
                    Square sqr;
                    System.out.println("---Square---");
                    System.out.print("Enter the side of square: ");
                    sqr= new Square(sc.nextDouble());
                    sDao.displayDetails(sqr);
                    sDao.getPerimeter(sqr);
                    sDao.getArea(sqr);
                }
                case 4 -> {//Triangle
                    Triangle tri = new Triangle();
                    System.out.println("\n---Triangle---");
                    System.out.print("Enter side 1: ");
                    tri.setSide1(sc.nextDouble());
                    System.out.print("Enter side 2: ");
                    tri.setSide2(sc.nextDouble());
                    System.out.print("Enter side 3: ");
                    tri.setSide3(sc.nextDouble());
                    sDao.displayDetails(tri);
                    sDao.getPerimeter(tri);
                    sDao.getArea(tri);
                }
                case 9 -> System.out.println("\nThank you for using mensuration assistant.");
                //Exit
                default -> System.out.println("Invalid Choice. Please try again!");
            }
        }
    }
 }
