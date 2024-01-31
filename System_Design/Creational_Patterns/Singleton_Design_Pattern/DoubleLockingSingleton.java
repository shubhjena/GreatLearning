package Creational_Patterns.Singleton_Design_Pattern;

public class DoubleLockingSingleton{
    private static volatile DoubleLockingSingleton instance;

    private DoubleLockingSingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static DoubleLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleLockingSingleton obj = DoubleLockingSingleton.getInstance();
        System.out.println(obj.getClass());
    }
}
