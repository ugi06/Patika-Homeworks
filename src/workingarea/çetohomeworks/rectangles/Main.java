package workingarea.çetohomeworks.rectangles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yükseklik giriniz: ");
        double heigth = scanner.nextDouble();

        System.out.print("Taban giriniz: ");
        double width = scanner.nextDouble();


        Rectangle basic = new Rectangle(heigth,width);

        System.out.print(basic);

    }
}
