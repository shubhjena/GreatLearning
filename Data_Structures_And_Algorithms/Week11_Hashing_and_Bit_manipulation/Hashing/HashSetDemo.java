package Week11_Hashing_and_Bit_manipulation.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(0);

        //size
        System.out.println("Size of the set is : "+ set.size());

        //search
        System.out.println(set.contains(1)); //prints T/F

        //delete
        set.remove(1);

        //printAll
        System.out.println(set);

        //Iteration
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ ", ");
        }
        System.out.println();

        //isEmpty
        if (!set.isEmpty())
            System.out.println("not Empty");
    }
}
