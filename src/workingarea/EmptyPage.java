package workingarea;
import java.util.Scanner;
public class EmptyPage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamaksayisi = scanner.nextInt();

        for (int i = basamaksayisi; i >= 1; i--) {
            for (int j = 0; j < basamaksayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
