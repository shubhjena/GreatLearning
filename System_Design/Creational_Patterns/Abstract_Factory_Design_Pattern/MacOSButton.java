package Creational_Patterns.Abstract_Factory_Design_Pattern;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS Button clicked");
    }
}
