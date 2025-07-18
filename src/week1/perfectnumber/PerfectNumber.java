package week1.perfectnumber;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı deneyiniz : ");   // Konsoldan veri almak için
        int input = scan.nextInt();

        int sumDivisors=0;  // Girilen sayının tam sayı bölenlerinin toplamını bulmak için değişken

        for (int i = 1; i < input;) {  // İnputun tam sayı çarpanlarını bulmak için for döngüsü

            if (input % i == 0){  // Eğer tam sayı çarpanı ise değer sumDivisors yükleniyor ve devam ediyor değilse devam ediyor.

                sumDivisors=sumDivisors+i;

                i++;
            }else {
                i++;
            }
        }
        if(sumDivisors==input){ // sumDivisors yani tam sayı bölenleri toplamı eğer girilen veriye eşitse mükememlel değil ise mükemmler değil
            System.out.println(input+" mükemmel bir sayıdır.");
        }else{
            System.out.println(input+" mükemmel değil.");
        }
    }
}