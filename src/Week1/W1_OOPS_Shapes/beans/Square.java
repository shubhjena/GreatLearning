package Week1.W1_OOPS_Shapes.beans;

public class Square extends Shapes {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void displayDetails(){
        System.out.println("\n--Displaying Details--");
        System.out.println("Side: "+side);
        System.out.println("Perimeter: "+this.calculateThePerimeter());
        System.out.println("Area: "+this.calculateTheArea());
    }

    @Override
    double calculateTheArea() {
        area = Math.pow(side,2);
        return area;
    }

    @Override
    double calculateThePerimeter() {
        perimeter = 4*side;
        return perimeter;
    }

    @Override
    void drawTheShape() {

    }
}
