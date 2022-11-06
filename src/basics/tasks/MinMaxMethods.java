package basics.tasks;

import java.util.Arrays;

public class MinMaxMethods {
    public static void main(String[] args) {
        int [] my_array = {10,243,64,23,2,5345,234,54322,4,46,600};
        int [] randomArray = {1,5,9,7,50};
        String [] strangeArray = {"#","##","$$$"};


        System.out.println(Arrays.toString(my_array));
        System.out.println(my_array[3]);
        System.out.println(max(my_array));
        System.out.println(max(randomArray));
        System.out.println(min(randomArray));
        System.out.println(strangeArray[1]);
        System.out.println(strangeArray[1].length());
        System.out.println(strangeArray[1].charAt(0)=='#');

    }
    //Max
    public static int max(int [] array){
        int max = array[0];
        for (int i=1;i< array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    //Min
    public static int min(int [] array){
        int min = array[0];
        for (int i=1;i< array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
