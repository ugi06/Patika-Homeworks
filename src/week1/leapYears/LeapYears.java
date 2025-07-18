package week1.leapYears;
import java.util.Scanner;
public class LeapYears {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan bir yıl girmesini ister
        System.out.print("Yıl Giriniz : ");
        int yıl = scan.nextInt();

        // 100' e tam bölünen artık yılar, 100'e tam bölünmeyen yinede artık olan yıllar ve artık yıl olmayan yılları oluşturmak için
        if((yıl&400)==0){

            System.out.println(yıl + " artık yıldır.");

        }else {

            if ((yıl & 100)!=0 && (yıl&4)==0){

                System.out.println(yıl + " artık yıldır.");

            }else {

                System.out.println(yıl + " artık yıl    değildir.");
            }
        }

        // Scanner'ı kapatır
        scan.close();
    }
}
