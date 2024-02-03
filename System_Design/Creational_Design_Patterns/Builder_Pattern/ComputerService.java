package Creational_Design_Patterns.Builder_Pattern;

public class ComputerService {
    public static void main(String[] args) {
        ComputerBuilder builder = new ConcreteComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        Computer gamingComputer = director.constructGamingComputer(builder);
        System.out.println("Gaming Computer: " + gamingComputer);

        Computer officeComputer = director.constructOfficeComputer(builder);
        System.out.println("Office Computer: " + officeComputer);
    }
}
