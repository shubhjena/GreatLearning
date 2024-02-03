package Creational_Design_Patterns.Builder_Pattern;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    // Additional properties...

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        // Set additional properties...
    }

    // Getters for Computer properties...

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }
}

