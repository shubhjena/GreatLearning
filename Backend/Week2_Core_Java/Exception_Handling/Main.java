package Week2_Core_Java.Exception_Handling;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("My first exception!");
        } catch (MyException e) {
            System.out.println("1.Raw Error");
            System.out.println(e);
            System.out.println("2.Error Message");
            System.out.println(e.getMessage());
            System.out.println("3.Stack Trace");
            e.printStackTrace();
        }
    }
}
