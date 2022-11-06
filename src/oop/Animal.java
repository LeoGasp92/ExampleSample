package oop;

public class Animal {

    //Fields

    private String type;
    private int avgLifeSpan;
    private double weight;

    //Methods

    // Constructor
    public Animal(String type, int avgLifeSpan, double weight){
        this.type = type;
        this.avgLifeSpan = avgLifeSpan;
        this.weight = weight;
    }
    // Constructor
    public Animal (String type, int avgLifeSpan){
        this.type = type;
        this.avgLifeSpan = avgLifeSpan;
    }
    // Default Constructor
    public Animal(){

    }


    public void printAnimalInfo(){
        System.out.println("Type : " + type);
        System.out.println("Average Lifespan : " + avgLifeSpan);
        System.out.println("Weight : " + weight);
    }
}
