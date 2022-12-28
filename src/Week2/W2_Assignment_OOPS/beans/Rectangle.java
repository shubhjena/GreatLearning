package Week2.W2_Assignment_OOPS.beans;

public class Rectangle implements Shape{
    private double length, breadth;
    static  String type = "Rectangle";
    //constructors
    public Rectangle(){}
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
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
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
