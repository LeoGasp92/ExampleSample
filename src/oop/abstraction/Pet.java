package oop.abstraction;

public abstract class Pet{
    protected String color;
    protected String eat ;
    protected String place;
    protected int age ;

    public abstract void printPetInfo();


//Building constructor
    public Pet(String color, String eat, String place, int age){
        this.color= color;
        this.eat = eat;
        this.place = place;
        this.age = age;

    }
//    ...OR...
//    public Pet(){}


}










/*
public abstract class Pet {

    protected String color;
    protected String eat;
    protected String place;
    protected int age;

    public abstract void printPetInfo ();

    // build constructor , so no void , no return , insert the fields either inside or customized
    public Pet(String color,String eat, String place,int age){
        this.color = color;
        this.eat = eat;
        this.place = place;
        this.age = age;

        }
}
*/


