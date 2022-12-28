package Week2.W2_Assignment_OOPS.beans;

import static java.lang.Math.PI;

public class Circle extends Shape{
    double radius;
    static String type = "Circle";

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {;
        return radius;
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
