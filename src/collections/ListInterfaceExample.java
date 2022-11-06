package collections;

import java.util.ArrayList;

public class ListInterfaceExample{
    public static void main(String[] args) {


        // Declaring Arraylist :
        ArrayList<String> car = new ArrayList<String>();

        // Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Lexus");
        car.add("Tesla");

        // To print out all elements
        System.out.println(car);

        // get element by index
        System.out.println(car.get(2));

        // add element at specific index
        car.add(3,"Honda");
        System.out.println(car);

        //change element value
        car.set(2,"Subaru");
        System.out.println(car);

        // remove element
        car.remove(1);
        System.out.println(car);

        // size
        System.out.println(car.size());

        // delete all elements
        car.clear();
        System.out.println(car);


    }
}















/*
public class ListInterfaceExample {
    public static void main(String[] args) {
        // Declaring Arraylist

        ArrayList<String> car = new ArrayList<>();


        // Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Toyota");
        car.add("Lexus");

        //Print out
        System.out.println(car);

        // Get elements , by index
        System.out.println(car.get(0));

        //Add element at specific index
        car.add(3 , "Honda");
        System.out.println(car);

        //Change element values
        car.set(2, "Subaru");
        System.out.println(car);

        //Remove
        car.remove(1);

        // get size
        System.out.println(car.size());

        // Delete all elements
        car.clear();
        System.out.println(car);

    }
}
*/
