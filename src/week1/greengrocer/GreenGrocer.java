package week1.greengrocer;

import java.util.Scanner;

public class GreenGrocer {
    public static void main(String[] args) {
        // Manav ürünlerinin kilogram fiyatları
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        Scanner scanner = new Scanner(System.in);

        // Üünlerden kaçar kilo aldığını kullanıcıya sorar
        System.out.print("Armut Kaç Kilo ? : ");
        double armut_kilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elma_kilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domates_kilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muz_kilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlıcan_kilo = scanner.nextDouble();

        // Ürünlerin birim fiyatı ve kaç birim alındığı ayrı ayrı çarpılıp toplanır
        double toplam_tutar = armut*armut_kilo + elma*elma_kilo + domates*domates_kilo + muz*muz_kilo + patlıcan*patlıcan_kilo;

        // Toplam tutarı yazdırır
        System.out.print("Toplam Tutar : " +toplam_tutar+" TL");

        scanner.close();
    }
}
