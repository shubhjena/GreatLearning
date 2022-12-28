package Week2.W2_Assignment_OOPS.beans;

public class Rectangle extends Shape{
    double length;
    double breadth;
    static  String type = "Rectangle";

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
    @Override
    public double calculateTheArea() {
        return length*breadth;
    }
    @Override
    public double calculateThePerimeter() {
        return 2*(length+breadth);
    }
    @Override
    public String getType() {
        return type;
    }
}
