package workingarea.tryingPage;
import java.util.Scanner;

public class WhilePassword {
    public static void main(String[] args) {

        System.out.println("Dikkat! 3 hakkınız vardır.");
        Scanner scanner = new Scanner(System.in);
        String password = "1234";
        boolean isTrue = true;
        int i =0;
        while(isTrue){
            String answer = scanner.nextLine();
            if(password.equals(answer)){
                System.out.println("Şifre Doğru!");
                break;
            } else {
                System.out.println("Şifre Yanlış!");
            }
            i++;
            if (i<3){
                System.out.println("Hakkınız kalmadı.");
                break;
            }
        }
    }
}
