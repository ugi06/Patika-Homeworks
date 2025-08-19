package week5.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // scanner and user's input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which day of the week do you want working hours information? ");
        String input = scanner.nextLine().toUpperCase();


        // try catch for find exception
        try {
            Day day = Day.valueOf(input);
            System.out.println(workingHours(day));
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong try again!");
        }
    }


    // method to display working hours
    static String workingHours(Day day){

        switch (day){
            case MONDAY , TUESDAY->{
                return "9 a.m. - 5 p.m. ";
            }
            case WEDNESDAY,THURSDAY -> {
                return "10 a.m. - 4 p.m. ";
            }
            case FRIDAY ->{
                return "9 a.m.- 6:30 p.m. ";
            }
            default -> {
                return "Undefined";
            }
        }
    }
}

