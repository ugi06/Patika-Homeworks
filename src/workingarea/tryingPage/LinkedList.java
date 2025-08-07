package workingarea.tryingpage;

import java.util.List;
import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> primes= new java.util.LinkedList<>();

        System.out.print("Kaç tane asal gireceksin : ");
        int adet = scanner.nextInt();

        int i = 0;

        do{
            primes.add(scanner.nextInt());
            i++;
        }
        while (i<adet);

        System.out.println(primes);
    }
}
