package week2.powercalculation;

import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan verileri ister.
        System.out.print("Kuvvetini alacağınız sayıyı giriniz : ");
        double inputNumber= scanner.nextDouble();

        System.out.print("Sayınızın kuvvetini giriniz: ");
        double inputPower = scanner.nextDouble();

        // işlemi main metotun dışındaki powerCalculation metotuna yollar ve return değerini döndürür.
        System.out.print("Sonuç: " + Math.pow(inputNumber,inputPower));

        scanner.close();

    }
}
