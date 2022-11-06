package basics;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array size : ");
        int arraySize = scanner.nextInt();
        int[] storageArray = new int[arraySize];
        System.out.println("Please enter array elements one by one");

        for (int i = 0 ; i < storageArray.length ; i++ ) {
            System.out.print("Enter Element " + "(" + (i+1) + ")" + " :  ");
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];
        }
        System.out.println("Array of elements : " + Arrays.toString(storageArray));
        // new technique for me, its more efficent...

        System.out.print("Sum of all elements = " + sum);
    }
}
