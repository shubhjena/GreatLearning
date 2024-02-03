package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button clicked");
    }
}
