package week1.maxMinFinder;
import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksin:"); // kullanıcıdan veri alır.
        int input = scanner.nextInt();

        int i = 0; // while döngüsü için sayaç.

        int[] setInputs = new int[input];// kullanıcının girdiği sayıları dizi haline getirir. Bu dizi sayesinde karşılaştırma yapabileceğiz.

        while (i<input){ // kullanıcıdan istediği kadar sayı girmesini sağlayan while döngüsü
            System.out.print( ( i + 1 ) + ". Sayıyı giriniz: ");
            int input1= scanner.nextInt();
            setInputs[i] = input1;
            i++;
        }

        // max ve min değerlerini tutan değişkenler
        int max = setInputs[0];
        int min = setInputs[0];


        for (int j = 1; j < input;) {// max ve min değerleri büyüklük küçüklük ilişkisi ile karşılaştıran for döngüsü
            boolean maxInput = max<setInputs[j];
            boolean minInput = min>setInputs[j];
            if(maxInput){
                max=setInputs[j];
            }else if (minInput){
                min = setInputs[j];
            }
            j++;
        }

        System.out.println("Maxsimum Sayı:"+max+"\n"+"Minimum Sayı : "+min);// ekrana yazdırır

        scanner.close();

    }
}
