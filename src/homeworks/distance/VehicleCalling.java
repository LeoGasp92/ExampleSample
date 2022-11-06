package homeworks.distance;

import java.util.Scanner;

public class VehicleCalling
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
        Vehicle vehicle = new Vehicle(fuel,fuelUsage,passengers);
        System.out.printf("Your vehicle can drive a Max of %.2f km ", vehicle.maxDistance());
        System.out.println();
        System.out.print(vehicle.maxDistance(100,10,4));



    }
}
















/*
public class VehicleCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle : ");
        float fuel = scanner.nextFloat();

        System.out.println("Enter vehicle fuel usage per 100km : ");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter number of passengers : ");
        int passenger = scanner.nextInt();

        // here we used the second constructor
        Vehicle vehicle = new Vehicle(fuel,fuelUsage,passenger);
        System.out.printf("Your vehicle can drive maximum of %.2f km ", vehicle.maxDistance());

        System.out.println();
        // here we are using the first constructor
        System.out.println(vehicle.maxDistance(100,10,4));


    }
}

*/