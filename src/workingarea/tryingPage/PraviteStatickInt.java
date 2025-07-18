package workingarea.tryingPage;

import java.util.Scanner;

public class PraviteStatickInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        int result = result(numberOne, numberTwo, numberThree);
        System.out.println("Result: " + result);
    }

    private static int result(int numberOne, int numberTwo, int numberThree)
    {
        int result = numberOne + numberTwo + numberThree;
        return result;
    }
}
