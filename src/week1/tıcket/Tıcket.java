package week1.tıcket;
import java.util.Scanner;

public class Tıcket {
    public static void main(String[] args) {

        //Kullanıcının veri girişi yapması için kullanılır
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan km cinsinden mesefe, yaş ve yolculuk tipini ister
        System.out.println("Mesafeyi km türünden giriniz : ");
        int mesafe_km = scan.nextInt();

        System.out.println("Yaşınız : ");
        int yas = scan.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculuktipi = scan.nextInt();

        // İndirimli biletleri hesaplamak için önceden verilmiş olan yüzdelikler 1 den çıkartılıp çarpılmıştır (örn: 1 - %10 = 0.9)

        // Biletini gidiş dönüş almış ise bu satır çalışır
        if (mesafe_km <= 0 || yas <= 0 || (yolculuktipi != 1 && yolculuktipi != 2) ){
            System.out.print("Hatalı veri girdiniz! ");
            return;
        }

        // Biletin indirimsiz halini hesaplar
        double biletÜcreti = mesafe_km*0.10;

        // Yaş indirimini atatığımız değişken
        double yasİndirimi = 0.0;

        // Yaşa göre indirim oranlarını belirler
        if (yas < 12){
            yasİndirimi = 0.50;
        }
        else if (yas >= 12 && yas <= 24) {
            yasİndirimi = 0.10;
        }
        else if (yas > 65) {
            yasİndirimi = 0.30;
        }

        //Yaş kriterlerine uyuyorsa indirimli fiyatı hesaplar
        double indirimliFiyat = biletÜcreti*(1-yasİndirimi);

        //Yolculuk tipine göre indirimi tanımlar
        if(yolculuktipi==2){
            double gidişDönüş = 0.20;
            indirimliFiyat = indirimliFiyat*(1-gidişDönüş)*2;
        }
        System.out.println( "Toplam Tutar: " + indirimliFiyat);
        scan.close();
    }
}
