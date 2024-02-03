package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox checked");
    }
}
