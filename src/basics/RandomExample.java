package basics;

import static java.lang.Math.min;

public class RandomExample {
    public static void main(String[] args) {
        float number = 5.6f;
        System.out.println("If number is : " +  number);

        //rounding value up
        System.out.println("Ceil : " + Math.ceil(number));

        // Rounding value down
        System.out.println("Floor : " + Math.floor(number));

        // Rounding according to math rules
        System.out.println("Round : " + Math.round(number));

        //Absolute value
        System.out.println("Abs : " + Math.abs(-13));

        // Power
        System.out.println("Power : " + (int)Math.pow(9,2));

        // Casting converting from one data type to another
        System.out.println("Casted Number from float to int : " + (int)number);

        //Min
        System.out.println("Min : " + min(100,33));

        //Max
        System.out.println("Max : " + Math.max(100,33));

        //Min or Max for 3 values
        System.out.println("Max from 3 : "+ Math.max(35,Math.max(33,85)));

        //Square Root
        System.out.println("Square root :" + Math.sqrt(64));

        // Random
        System.out.println("Random 1 : " + Math.random());
        System.out.println("Random 2 (0-9)  : " + (int)(Math.random()*10));
        System.out.println("Random 3 (0-10) : " + (int)(Math.random()*11));
        System.out.println("Random 4 (1-10) : " + ((int)(Math.random()*10)+1));

    }
}
