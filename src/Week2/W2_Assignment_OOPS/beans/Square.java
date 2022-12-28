package Week2.W2_Assignment_OOPS.beans;

public class Square extends Rectangle{
    private double side;
    static String type = "Square";

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateTheArea() {
        return side*side;
    }
    @Override
    public double calculateThePerimeter() {
        return 4*side;
    }
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
