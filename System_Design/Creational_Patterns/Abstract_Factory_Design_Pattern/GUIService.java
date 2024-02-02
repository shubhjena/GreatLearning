package Creational_Patterns.Abstract_Factory_Design_Pattern;

public class GUIService {
    public static void main(String[] args) {
        // Choose the factory based on the desired platform (Windows or MacOS)
        GUIFactory factory = new WindowsFactory(); // or new MacOSFactory();

        // Use the factory to create buttons and checkboxes without specifying their concrete classes
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Use the created products
        button.click();
        checkbox.check();
    }
}
