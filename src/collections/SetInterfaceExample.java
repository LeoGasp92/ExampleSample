package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetInterfaceExample {
    public static void main(String[] args) {

        // HashSet

        HashSet<String> names = new HashSet<>();

        //Add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        names.add("Anna");

        System.out.println(names);

        // remove element
        names.remove("Bob ");
        System.out.println(names);

        //size
        System.out.println(names.size());

        // Contains
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        // Iterate
        for(String str : names){
            System.out.print(str + " ");
        }
        System.out.println();

        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+ " ");
        }

        // Example 2
        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);
        System.out.println("intSet 1 : " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);
        System.out.println("IntSet 2: " + intSet2);

        // Find Union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("Union before : " + union);
        union.addAll(intSet2);
        System.out.println("Union after : " + union);







    }
}


















/*
public class SetInterfaceExample {

    public static void main(String[] args) {

        // HashSet

        HashSet<String> names = new HashSet<String>();

        //Adding elements.
        names.add("Luca");
        names.add("Laura");
        names.add("Marco");
        names.add("Stefano");

        // Printing out sometimes it can arrange them not in order as displayed
        System.out.println(names);

        // Add same element
        names.add("Luca");
        System.out.println(names);// it will not add same element twice

        //Remove Element
        names.remove("Stefano");
        System.out.println(names);

        // getting size
        System.out.println(names.size());

        //Contains returning true or false value
        System.out.println(names.contains("Roberto"));

        // Iterate

        for(String str: names){
            System.out.println(str);
        }

        //Iterator
        Iterator<String> i = names.iterator();
        while ( i.hasNext()){
            System.out.println(i.next());
        }

        // Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);
        System.out.println("intSet 1 : " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);
        System.out.println("intSet 2 : " + intSet2);

        // Find Union between two sets
        HashSet<Integer> union = new HashSet<>(intSet1);//with HashSet we can pass value inside
        System.out.println("Union before : " + union);
        union.addAll(intSet2);
        System.out.println(("Union after : " + union));

        // Find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection : " + intersection);

        //Differnece in set 1
         HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("Difference is : " + difference);

        //Differnece in set 2
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference2.removeAll(intSet1);
        System.out.println("Difference is : " + difference2);

        //Difference in set 1 and set 2
        HashSet<Integer> diffAll = new HashSet<>(difference);
        diffAll.addAll(difference2);
        System.out.println("Over all difference : "+ diffAll);

        //linkedHashSet
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add("Estonia ");
        linkedHashSet.add("Latvia ");
        linkedHashSet.add("Italy ");
        linkedHashSet.add("Sweden ");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);




    }
}
*/