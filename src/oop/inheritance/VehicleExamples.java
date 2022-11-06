package oop.inheritance;

class Vehichle {
    protected String brand;

    public void honk() {
        System.out.println("Peep Peep");
        System.out.println("My brand is : " + brand);
    }
}

class Bike extends Vehichle{
    @Override
    public void honk() {
        System.out.println("Broom Broom");
        System.out.println("My brand is : " + brand);
    }
}


public class VehicleExamples {
    public static void main(String[] args) {
        Vehichle vehichle = new Vehichle();
        vehichle.brand= "Tesla.";
        vehichle.honk();

        Bike bike = new Bike();
        bike.brand= "Honda.";
        bike.honk();


    }
}




















/*
class Vehicle{
    protected String brand; // unlink private we can use it in the main class of the same file.

    public void honk(){
        System.out.println("Tutu");
        System.out.println("My brand is : " + brand);
    }
}
class Bike extends Vehicle{
    public void honk() {
        System.out.println("Broom broom");
        System.out.println("My brand is : " + brand);
    }
}

public class VehicleExamples {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Honda ";
        bike.honk();

    }
}
*/
