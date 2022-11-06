package homeworks.carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter floor Size : ");
        System.out.print("Enter floor Length : ");
        double length = scanner.nextDouble();
        System.out.print("Enter floor Width : " );
        double width = scanner.nextDouble();

        // Create a floor class object .

        Floor floor = new Floor(width,length);

        System.out.println("Enter Carpet price per m^2 : ");
        double cost = scanner.nextDouble();

        // Create Carpet Class Object
        Carpet carpet = new Carpet(cost);

        // Create Calculator Object
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("Carpet will cost : " + "Euro"+
                calculator.getTotalCost());
        }
    }










/*
import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor size : ");
        System.out.print("Enter floor Length : ");
        double length = scanner.nextDouble();

        System.out.print("Enter floor width : ");
        double width = scanner.nextDouble();

        //Create floor class object
        Floor floor = new Floor(width,length);

        System.out.print("Enter Carpet price per m2 : ");
        double cost = scanner.nextDouble();

        // Create carpet class object

        Carpet carpet = new Carpet(cost);

        // Create Calculator object and pass Floor & Carpet objects as input parameters
        Calculator calculator = new Calculator(floor,carpet);
        System.out.print("Carpet will cost : " + calculator.getTotalCost() + " Eur");

    }
}
*/