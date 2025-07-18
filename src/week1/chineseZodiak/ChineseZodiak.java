package week1.chineseZodiak;

import java.util.Scanner;

public class ChineseZodiak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan doğum yılını ister
        System.out.print("Doğum Yılınızı Girin : ");
        int dogumYılı = scan.nextInt();

        // Burçaların sıralı şekilde bulunduğu string dizisi
        String[] burclar = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz", "Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};

        // Doğum yılının 12 ye bölümünden kalnını tutar
        int kalan = dogumYılı % 12;

        //Kalanın String dizisideki kaçınıcı elamana karşılık geldiğini bulur ve kullanıcının burcunu yazdırır
        System.out.print("Çin Zodyağı Burcunuz : " + burclar[kalan]);

        // Scanner'ı kapatır
        scan.close();

    }
}
