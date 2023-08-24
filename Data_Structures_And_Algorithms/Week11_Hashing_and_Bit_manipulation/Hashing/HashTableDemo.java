package Week11_Hashing_and_Bit_manipulation.Hashing;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        //add
        hashtable.put("A", 1);

        //get
        int valueA = hashtable.get("A");

        //remove
        hashtable.remove("B");

        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
        // Iterating using enhanced for loop
        for (Map.Entry<String, Integer> e : hashtable.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
