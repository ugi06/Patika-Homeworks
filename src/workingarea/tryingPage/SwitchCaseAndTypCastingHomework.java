package workingarea.tryingpage;

import java.util.Scanner;

public class SwitchCaseAndTypCastingHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Pozitif Tam sayı giriniz : ");
        int input = scanner.nextInt();

        System.out.println(sumOfDigits(input));
    }

    private static int sumOfDigits(int input){
        if(input==0) return 0;
        return (input%10) + sumOfDigits(input / 10 );
    }
}
