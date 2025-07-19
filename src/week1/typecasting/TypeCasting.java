package week1.typecasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("int tipinde sayı giriniz: ");  // Kullanıcıdan bir int bir double tipinde veri alır.
        int inputInt = scanner.nextInt();

        System.out.print("double tipinde bir sayı giriniz: ");
        double inputDouble = scanner.nextDouble();

        int doubleToInt = (int) inputDouble;    // Veri tipi değiştirme işlemini burda yapar.
        double intToDouble = inputInt;

        System.out.println("Int tipindeki değişkeniniz double tipine dönüştürüldü: "+intToDouble);   // Ekrana yazdırır
        System.out.print("Double tipindeki değişkeniniz int tipine dönüştürüldü: "+doubleToInt);
    }
}