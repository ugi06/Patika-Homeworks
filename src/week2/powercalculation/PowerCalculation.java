package week2.powercalculation;

import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan verileri ister.
        System.out.print("Kuvvetini alacağınız sayıyı giriniz : ");
        double base= scanner.nextDouble();

        System.out.print("Sayınızın kuvvetini giriniz: ");
        double exponent = scanner.nextDouble();

        // işlemi main metotun dışındaki powerCalculation metotuna yollar ve return değerini döndürür.
        System.out.print("Sonuç: " + Math.pow(base,exponent));

        scanner.close();

    }
}
