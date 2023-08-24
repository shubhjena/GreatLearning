package Week2_OOPS.W2_Assignment_OOPS.dao;

import Week2_OOPS.W2_Assignment_OOPS.beans.Shape;

public class ShapeDao {

    public void getArea(Shape sh){
        System.out.println("Area of the "+sh.getType()+" = "+sh.calculateTheArea());
    }
    public void getPerimeter(Shape sh){
        System.out.println("Perimeter of the "+sh.getType()+" = "+sh.calculateThePerimeter());
    }
    public void displayDetails(Shape sh){
        System.out.println(sh.toString());
    }
}
