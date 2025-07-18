package week1.processingPriority;
import java.util.Scanner;
public class ProcessingPriority {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan 3  sayı girmesini ister
        System.out.println("İlk Sayınızı girin : ");
        double a = scan.nextDouble();

        System.out.println("İkinci Sayınızı girin : ");
        double b = scan.nextDouble();

        System.out.println("üçüncü Sayınızı girin : ");
        double c = scan.nextDouble();

        // Belirlenmiş işlemi girilen sayılar ile process değişkenine atar
        double process = a + (b*c) - b ;

        //Sonucu yazdırır
        System.out.println("işlem sonucu : "+process);

        // Scanner'ı kapatır
        scan.close();
    }
}
