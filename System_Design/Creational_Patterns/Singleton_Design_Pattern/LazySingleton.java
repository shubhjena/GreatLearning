package Creational_Patterns.Singleton_Design_Pattern;

public class LazySingleton {
    //defers the creation of the instance until it is actually needed
    private static LazySingleton instance;

    private LazySingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton obj = LazySingleton.getInstance();
        System.out.println(obj.getClass());
    }
}
