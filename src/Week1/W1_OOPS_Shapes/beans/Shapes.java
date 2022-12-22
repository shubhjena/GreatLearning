package Week1.W1_OOPS_Shapes.beans;

abstract class Shapes {
    double area,colour,perimeter;
    String type;
    abstract double calculateTheArea();
    abstract double calculateThePerimeter();
    abstract void drawTheShape();
}
