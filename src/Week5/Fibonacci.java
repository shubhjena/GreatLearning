package Week5;

public class Fibonacci {
    static final int terms = 20;
    static int count=0;
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence");
        fibonacciSequence(0,1);
    }
    public static void  fibonacciSequence(int a, int b){
        if(count < terms) {
            System.out.print(a+" ");
            count++;
            fibonacciSequence(b, a + b);
        }
    }
}
