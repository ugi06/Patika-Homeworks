package week1.matrixtranspose;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);              // Kullacıdan kaça kaç bir matris tanımlamak istediğini sorar ve verileri alır.

        System.out.print("Matrisiniz kaç satır : ");
        int row = scanner.nextInt();
        System.out.print("Matrisiniz kaç sütun : ");
        int collum = scanner.nextInt();

        double[][] inputArray = new double[row][collum];         // iki çeşit matrisimiz olduğu için iki tane 2 boyutlu dizi tanımlar.
        double[][] arrayTranspose = new double[collum][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <collum; j++) {

                System.out.print("[" + i + "," + j + "] = ");
                inputArray[i][j] = scanner.nextDouble();        // Yeni bir metot ! Direkt arrayi scanner etmek.
            }
        }

        for (int i = 0; i < collum; i++) {                        /*Matriksimizin transpozunu bulabilmek için satır ve
                                                                  sütun bilgilerini yer değiştirip yeni bir matrikse atamalıyız. */
            for (int j = 0; j <row; j++) {
                arrayTranspose[i][j] = inputArray[j][i];
            }
        }

        System.out.println("\nMatrisiniz: ");                     // Matriks formatında çıktı almak için.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                System.out.print(inputArray[i][j] + "  ");
            }
            System.out.println();                                 // Her satırdan sonra satır atla.
        }

        System.out.println("\nMatrisinizin Transpozu :  ");        // Matriksin Transpozunun çıktısı için.
        for (int i = 0; i < collum; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arrayTranspose[i][j] + "  ");
            }
            System.out.println();
        }

    scanner.close();

    }
}