package week1.invertedtriangle;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);       // Konsoldan veri almak için
        System.out.print("Kaç satırlı bir ters üçgen istersin: ");
        int input = scan.nextInt();

        for (int i = 0; i < input;i++) {

            for (int j = i; j <input; ) {           // İç içe for döngüleri tekrarlı işlemleri yapabilmek için
                System.out.print("*");              // Bu satır 'System.out.println("*");' kodundan farklıdır yanyana yazdırmak için kullanılır.
                j++;

                if(j==input){
                    System.out.println();        // Yan yana yazılan * ları üçgen halinde dizmek için alt satıra geçirir
                }
            }
        }
        scan.close();
    }
}
