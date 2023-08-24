package Week2_OOPS.W2_Assignment_OOPS.beans;

import static java.lang.Math.PI;

public class Circle implements Shape{
    private double radius;
    String type = "Circle";

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateTheArea() {
        return PI*radius*radius;
    }
    @Override
    public double calculateThePerimeter() {
        return 2*PI*radius;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}