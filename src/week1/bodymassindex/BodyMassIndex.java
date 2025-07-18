package week1.bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuzu Giriniz: ");
        double boy = scanner.nextDouble()/100;

        double result = result(kilo,boy);
        System.out.println("Vücut Kitle İndexsiniz: "+result);
    }
    private static double result(double kilo,double boy){
        return kilo/(boy*boy);
    }
}
