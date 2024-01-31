package Creational_Patterns.Singleton_Design_Pattern;

public class SynchronizedSingleton{
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        SynchronizedSingleton obj = SynchronizedSingleton.getInstance();
        System.out.println(obj.getClass());
    }
}
