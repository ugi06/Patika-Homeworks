package week5.lambdas;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Lambda's Function method
        Function<Integer,Integer> evenNumbers = s -> s*2;

        // Print
        for (int i = 1; i < 11; i++) {
            System.out.println(evenNumbers.apply(i));
        }

        System.out.println("-----------------------");

        // Lambda's List method and stream using
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        list.stream()
                .map(evenNumbers)
                .forEach(System.out::println);
        ;

    }
}