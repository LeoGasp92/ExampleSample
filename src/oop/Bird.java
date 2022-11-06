package oop;

public class Bird {

    //Fields
    private String name;
    private String color;
    private double avgLifeSpan ;






    //basics.Methods
    // In methods, IF we are using private access modifiers, then we will need setters/getters methods
    // to use these private fields structure and assign them values in their respective class.


    // Setter Method :
    public void setName (String name){

        this.name = name;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setAvgLifeSpan(double avgLifeSpan) {

        this.avgLifeSpan = avgLifeSpan;
    }

    // Getter Method :
    public String getName() {

        return name;
    }
    public String getColor() {
        return color;
    }
    public double getAvgLifeSpan() {

        return avgLifeSpan;
    }


    public void printBirdInfo(){

        System.out.println("Bird info :- ");
        System.out.println("Name : " + name);
        System.out.println("Color: " + color);
        System.out.println("Average Life Span : " + avgLifeSpan);


    }


}
