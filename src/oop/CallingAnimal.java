package oop;

public class CallingAnimal {
    public static void main(String[] args) {

        // Creating animal instance

        Animal animal1 = new Animal("Dog",15,10.75d);
        animal1.printAnimalInfo();

        Animal animal2 = new Animal("Cat",7);
        animal2.printAnimalInfo();

        Animal animal3 = new Animal();
        animal3.printAnimalInfo();


    }
}
