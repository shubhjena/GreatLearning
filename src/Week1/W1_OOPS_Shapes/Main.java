package Week1.W1_OOPS_Shapes;

public class Main {
    public static void main(String[] args) {
        int a=0;
        for(int i=0; i<=10;i++) {
            a+=1;
            System.out.println("Value of a: "+ a);
            for(int j=1; j<=5; j++){
                System.out.print(a+"."+j+"; ");
            }
            System.out.println();
        }
    }
}