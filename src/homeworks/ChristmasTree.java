package homeworks;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Christmas Tree Length : ");
        int size = scanner.nextInt();

        // Levels
        for (int i = 0; i < size; i++) {

            //Spaces
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Trunk spaces
        for (int j = 0; j < size - 1 ; j++) {
            System.out.print(" ");
        }
        System.out.print("#");
    }
}