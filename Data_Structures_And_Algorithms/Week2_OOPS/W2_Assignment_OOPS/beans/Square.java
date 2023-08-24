package Week2_OOPS.W2_Assignment_OOPS.beans;

public class Square extends Rectangle{
    private double side;
    static String type = "Square";
    //constructor
    public Square(double side) {
        super(side, side);
        this.side = side;
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
