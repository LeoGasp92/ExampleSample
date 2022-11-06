package homeworks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year : ");
        int inputYear = scanner.nextInt();

        if (inputYear%4==0 || inputYear%100==0 || inputYear%400==0){
            System.out.print(inputYear + " is a leap year.");
        }else{
            System.out.print(inputYear + " is not a leap year.");
        }
    }
}
