package Creational_Design_Patterns.Builder_Pattern;

public class ConcreteComputerBuilder extends ComputerBuilder {

    @Override
    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    // Additional methods for setting other properties...

    @Override
    public Computer build() {
        return new Computer(this);
    }
}

