package Creational_Design_Patterns.Singleton_Pattern;
/**
 *4 ways to achieve singleton
 * 1. Eager
 * 2. Lazy
 * 3. Synchronized method
 * 4. Double Locking
 */
public class EagerSingleton {
    //static to make it class member and hence sigle copy shared by all
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton obj = EagerSingleton.getInstance();
        System.out.println(obj.getClass());
    }
}
