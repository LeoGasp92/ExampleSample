package collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListInterfacesExample2{
    public static void main(String[] args) {
        // Example 1

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("List 1 : " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2 : " + list2);

        // Example 2
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");
        System.out.println("arrayList : " + arrayList);

        for(int i = 0 ; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for(String str : arrayList ){
            System.out.print(str + " ");
        }
        System.out.println();

        // LinkedList

        LinkedList<String> car = new LinkedList<>();
        car.add("Volvo");
        car.add("Lexus");
        car.add("Tesla");
        System.out.println(car);
        System.out.println(car.getLast());
        System.out.println(car.get(car.size()-1));



        // Create a new LinkedList object
        // Populate the list with numbers from 1 to 100
        // Print all the elements in the LinkedList

        LinkedList<Integer> numbersList = new LinkedList<Integer>();

        for( int i = 1 ; i <= 100 ; i++){
            numbersList.add(i);
        }
        System.out.println(numbersList);





    }
}
















/*
public class ListInterfacesExample2 {

    public static void main(String[] args) {

        //Example 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1 : " + list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2 : " + list2);

        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Test 1 ");
        arraylist.add("Test 2 ");
        arraylist.add("Test 3 ");
        System.out.println("arraylist list : " + arraylist);

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.print(arraylist.get(i) + " ");
        }
        System.out.println();

        for (String str : arraylist) {
            System.out.print(str + " ");

        }
        System.out.println();

        //LinkedList

        LinkedList<String> car = new LinkedList<String>();

        car.add("Volvo");
        car.add("Honda");
        car.add("Toyota");
        System.out.println(car);
        System.out.println(car.get(car.size()-1));
        System.out.println(car.getFirst());
        System.out.println(car.getLast());


        // Create a new LinkedList object
        // Populate the list with numbers from 1 to 100
        // Print all the elements in the LinkedList

        LinkedList<Integer> numbersList = new LinkedList<Integer>();

        for( int i = 1 ; i <= 100 ; i++){
            numbersList.add(i);
        }
        System.out.println(numbersList);



    }
}
*/