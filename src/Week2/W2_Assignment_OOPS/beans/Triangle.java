package Week2.W2_Assignment_OOPS.beans;

public class Triangle implements Shape {
    private double side1, side2, side3;
    static String type = "Triangle";

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double calculateTheArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double calculateThePerimeter() {
        return side1+side2+side3;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

}
