package homeworks.distance;

import java.util.Scanner;
public class CarCalling
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fuel amount in your vehicle : ");
        float fuel = scanner.nextFloat();
        System.out.print("Enter your vehicle fuel usage per 100 km : ");
        float fuelUsage = scanner.nextFloat();
        System.out.print("Enter number of Pax : ");
        int passengers = scanner.nextInt();
        System.out.println("Air Con on ? y/n ");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airCon = false ;
        if(input == 'y' )
        {
            airCon = true;
        }
        Car car = new Car(fuel,fuelUsage,passengers,airCon);
        System.out.printf("Your vehicle can drive a Max of %.2f km ", car.maxDistance());
        System.out.println();
        System.out.println(car.maxDistance(100,10,5));

    }
}












/*
public class CarCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fuel amount in your vehicle : ");
        float fuel = scanner.nextFloat();

        System.out.print("Enter vehicle fuel usage per 100km : ");
        float fuelUsage = scanner.nextFloat();

        System.out.print("Enter number of passengers : ");
        int passenger = scanner.nextInt();

        System.out.print("Will you turn on the Air Con ? y/n ? ");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airConditionar = false;
        if(input == 'y'){airConditionar = true;}
        Car car = new Car(fuel,fuelUsage,passenger,airConditionar);
        System.out.printf("Your vehicle can drive maximum of %.2f km ", car.maxDistance());
        System.out.println();
        // to use the first constructor
        System.out.println(car.maxDistance(100,10,5));

    }
}
*/