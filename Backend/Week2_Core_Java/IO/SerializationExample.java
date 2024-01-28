package Week2_Core_Java.IO;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 25);

        // Serialize the Person object to a file
        serializePerson(person, "person.ser");

        // Deserialize the Person object from the file
        Person deserializedPerson = deserializePerson("person.ser");

        // Display the deserialized Person object
        System.out.println("Deserialized Person: " + deserializedPerson);
    }

    // Serialize a Person object to a file
    private static void serializePerson(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Serialization completed. Object written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize a Person object from a file
    private static Person deserializePerson(String filename) {
        Person person = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            person = (Person) ois.readObject();
            System.out.println("Deserialization completed. Object read from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}
