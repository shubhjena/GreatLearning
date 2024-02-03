package Creational_Design_Patterns.Builder_Pattern;

public abstract class ComputerBuilder {
    protected String CPU;
    protected String RAM;
    protected String storage;
    protected String GPU;

    abstract ComputerBuilder setCPU(String CPU);

    abstract ComputerBuilder setRAM(String RAM);

    abstract ComputerBuilder setStorage(String storage);

    abstract ComputerBuilder setGPU(String GPU);
    // Additional methods for setting other properties...

    abstract Computer build();
}
