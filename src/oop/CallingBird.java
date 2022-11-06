package oop;

import java.security.spec.RSAOtherPrimeInfo;

public class CallingBird {
    public static void main(String[] args) {

        Bird bird1 = new Bird();

        // if our access modifiers are private then we use setters/getters to call them from
        // their classes to use them in the

        //Setting field values using setter methods.
        bird1.setName("Parrot");
        bird1.setColor("Green");
        bird1.setAvgLifeSpan(70);



        //Getting values using getter basics.Methods.
        System.out.println(bird1.getName());
        System.out.println(bird1.getColor());
        System.out.println(bird1.getAvgLifeSpan());
        System.out.println();

        // Get Bird details from printBirdInfo Method
        bird1.printBirdInfo();


    }
}


//OR in case the access Modifier in the fields are public then we can instead use :

/*
        System.out.println(bird1.name);

        //Set fields values
        bird1.name= "Owl";
        bird1.color= "White";
        bird1.avgLifeSpan = 15.7d;

        // Get field values
        System.out.println(bird1.name);
        System.out.println(bird1.color);
        System.out.println(bird1.avgLifeSpan);

    }
}*/
