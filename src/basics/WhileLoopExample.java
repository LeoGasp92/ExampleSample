package basics;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';


        while (runAgain == 'y'){

            System.out.println("Please enter any number");
            int input = scanner.nextInt();

            if(input < 0){
                for (int j = 0 ; j >=input ; j--){
                    System.out.print(j + " ");
                }
            }else{
                for (int j = 0; j <= input; j++){
                    System.out.print(j + " ");
                }
            }
            System.out.println("\nDo you want to run again? (y/n)");
            runAgain = scanner.next().charAt(0);
        }
        }
    }


