package workingarea.tryingpage;

import java.util.Arrays;
import java.util.Scanner;

public class PublicStatickIntArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] tryArray = new int[5];

        int[] copy = Arrays.copyOf(tryArray,tryArray.length);

        copyArray(tryArray);
    }

    public static void copyArray(int[] source) {
        for (int i = 0; i < source.length;) {
            System.out.println(i + ". sayı " +source[i]+" ");
            i++;
        }
    }

}