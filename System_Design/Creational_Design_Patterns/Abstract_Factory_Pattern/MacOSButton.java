package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS Button clicked");
    }
}
