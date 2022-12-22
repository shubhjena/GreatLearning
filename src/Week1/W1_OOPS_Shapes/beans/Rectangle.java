package Week1.W1_OOPS_Shapes.beans;

public class Rectangle extends Shapes{
    private double height, width;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateTheArea() {
        area = height*width;
        return area;
    }

    @Override
    double calculateThePerimeter() {
        perimeter = 2*(height+width);
        return perimeter;
    }

    @Override
    void drawTheShape() {

    }

    public void displayDetails(){
        System.out.println("\n--Displaying the details--");
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("Perimeter: "+this.calculateThePerimeter());
        System.out.println("Area: "+this.calculateTheArea());
    }
}
