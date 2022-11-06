package homeworks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int rand,guess; // generate two data types of same type with no value.
        //int guessingAttempts = ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter max random range : ");
        int max = scanner.nextInt();// 0-20

        rand = (int)(Math.random()*(max+1));
        System.out.println("Generated random number : " + rand);

        do {
            System.out.print("Guess Number : ");
            guess = scanner.nextInt();
            if(guess<rand){
                System.out.println("Try bigger number!");
            }
            else if(guess>rand){
                System.out.println("Try smaller number!");
            }


        } while(guess != rand);




        System.out.println("Congratulation , you won !");



    }
}
