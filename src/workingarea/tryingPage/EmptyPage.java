package workingarea.tryingpage;


import java.util.Scanner;

public class EmptyPage {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        String input = scanner.nextLine();

        if(isPalindrom(input)){
            System.out.println("Saynız bir Palindrom sayıdır");
        }else {
            System.out.println("Sayınız bir Palindrom sayı değildir!");
        }
    }

    static boolean isPalindrom(String input){
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i)!=input.charAt(input.length()-1 -i)){
                return false;
            }
        } return true;
    }
}
