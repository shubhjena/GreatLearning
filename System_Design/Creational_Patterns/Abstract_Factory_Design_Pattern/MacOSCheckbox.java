package Creational_Patterns.Abstract_Factory_Design_Pattern;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("MacOS Checkbox checked");
    }
}
