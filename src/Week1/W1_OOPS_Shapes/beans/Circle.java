package Week1.W1_OOPS_Shapes.beans;


public class Circle extends Shapes{
    private double radius;
    String type = "Circle";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void displayDetails(){
        System.out.println("\n--Displaying Details--");
        System.out.println("Radius: "+radius);
        System.out.println("Perimeter: "+this.calculateThePerimeter());
        System.out.println("Area: "+this.calculateTheArea());
    }
    @Override
    double calculateTheArea() {
        area = Math.PI*Math.pow(radius,2);
        return area;
    }
    @Override
    double calculateThePerimeter() {
        perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    @Override
    void drawTheShape() {

    }
}
