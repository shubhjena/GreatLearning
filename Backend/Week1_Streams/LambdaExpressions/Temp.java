package Week1_Streams.LambdaExpressions;

public interface Temp {
    int square(int n);

    default int cube(int n){
        return n*n*n;
    }

    default int squareIt(int n){
        return n*n;
    }

    static int multiply(int a, int b){
        return a*b;
    }
}
