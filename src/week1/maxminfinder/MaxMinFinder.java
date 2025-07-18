package week1.maxminfinder;
import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kullanıcıdan veri alır.
        System.out.print("Kaç sayı gireceksin:");
        int input = scanner.nextInt();

        // while döngüsü için sayaç.
        int i = 0;

        // kullanıcının girdiği sayıları dizi haline getirir. Bu dizi sayesinde karşılaştırma yapabileceğiz.
        int[] setInputs = new int[input];

        // kullanıcıdan istediği kadar sayı girmesini sağlayan while döngüsü
        while (i<input){
            System.out.print( ( i + 1 ) + ". Sayıyı giriniz: ");
            int input1= scanner.nextInt();
            setInputs[i] = input1;
            i++;
        }

        // max ve min değerlerini tutacak olan değişkenler
        int max = setInputs[0];
        int min = setInputs[0];

        // max ve min değerleri büyüklük küçüklük ilişkisi ile karşılaştıran for döngüsü
        for (int j = 1; j < input;) {
            boolean maxInput = max<setInputs[j];
            boolean minInput = min>setInputs[j];
            if(maxInput){
                max=setInputs[j];
            }else if (minInput){
                min = setInputs[j];
            }
            j++;
        }

        // ekrana yazdırır
        System.out.println("Maxsimum Sayı:"+max+"\n"+"Minimum Sayı : "+min);
        scanner.close();
    }
}
