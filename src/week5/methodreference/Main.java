package week5.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // List of names
        List<String> names = Arrays.asList("Uğur", "Kaan", "Alper", "Sabiha");

        // Method reference's println method without using for loop
        names.forEach(System.out::println);

        System.out.println("----");

        // List of integer
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(System.out::println);

        System.out.println("----");


        // Consumer using example
        Consumer<String> stringConsumer = System.out::println;

        stringConsumer.accept("UğuR");
        stringConsumer.accept("KaaN");
        stringConsumer.accept("AlpeR");
        stringConsumer.accept("SabihA");


        System.out.println("----");

        // BiPredicate using for equals method

        BiPredicate<String, String> stringPredicate = String::equals;

        System.out.println(stringPredicate.test("Uğur", "UğuR"));
        System.out.println(stringPredicate.test("Sabiha", "SabihA"));
        System.out.println(stringPredicate.test("AlpeR", "AlpeR"));
    }
}
