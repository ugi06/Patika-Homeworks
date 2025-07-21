package week2.numberrounding;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan double tipinde bir veri girişi ister.
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double input = scanner.nextDouble();
        // Üç dönüşümü yapar ve yazdırır.
        System.out.print("Aşağı Yuvarlama: "+ Math.floor(input)
                + "\n" +"Yukarı Yuvarlama: "+ Math.ceil(input)
                + "\n" +"En Yakın Tam Sayı: "+ Math.round(input));

        scanner.close();
    }
}
