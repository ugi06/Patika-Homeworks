package week2.numberrounding;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir ondalıklı sayı giriniz: ");
        double input = scanner.nextDouble();

        System.out.println("Aşağı Yuvarlama: "+ Math.floor(input));
        System.out.println("Yukarı Yuvarlama: "+ Math.ceil(input));
        System.out.println("En Yakın Tam Sayı: "+ Math.round(input));

    }
}
