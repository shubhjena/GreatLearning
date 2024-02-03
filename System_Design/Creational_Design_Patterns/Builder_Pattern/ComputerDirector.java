package Creational_Design_Patterns.Builder_Pattern;

public class ComputerDirector {
    public Computer constructGamingComputer(ComputerBuilder builder) {
        return builder.setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .build();
    }

    public Computer constructOfficeComputer(ComputerBuilder builder) {
        return builder.setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("500GB HDD")
                .setGPU("Integrated Graphics")
                .build();
    }
}
