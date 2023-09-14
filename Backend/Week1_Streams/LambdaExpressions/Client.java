package Week1_Streams.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Client {
    public static void main(String[] args) {
        Temp temp = n -> n*n;

        System.out.println(temp.square(5));
        System.out.println(temp.squareIt(5));
        System.out.println(temp.cube(5));
//        System.out.println(temp.multiply(5,6)); //invalid

//        System.out.println(Temp.square(5)); //invalid as no method implementation
//        System.out.println(Temp.squareIt(5)); //invalid Only static method cab be called w/o implementation
//        System.out.println(Temp.cube(5)); //invalid Only static method cab be called w/o implementation
        System.out.println(Temp.multiply(2,5));

        //JAVA Functional interfaces

        //consumer - void return
        Consumer<List<Integer>> consumer = list -> list.forEach(x-> System.out.println(x*100));
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(3);
        consumer.accept(list);

        //predicate - boolean return
        Predicate<Integer> greaterThan = res -> res>10;
        greaterThan.test(50);
        greaterThan.test(9);

        //function - return type is second generic
        Function<Integer,Double> test = a->a/2.0;
        test.apply(10);

        //supplier - generic is the return type
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());
    }
}
