package Creational_Patterns.Prototype_Design_Pattern;

public class Student implements Prototype {
    int age;
    String name;
    private int rollNumber;

    public Student() {
    }

    public Student(int age, String name, int rollNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public Prototype clone() {
        return new Student(age, name, rollNumber);
    }
}
