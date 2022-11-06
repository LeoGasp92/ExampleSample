package patterns.creational.factory;

//abstract : to prevent user to create object from this class but only form subclass
// we are using abstract methods implementing getter methods , by doing so it will become sort of a rule
// to pass these methods to the subclasses
//Basically abstract methods are abstract methods that have to be implemented in the subclasses.

public abstract class Computer {
    public abstract  String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    public String toString(){
        return "RAM = " + this.getRAM() + " HDD = "+ this.getHDD() + " CPU = " + this.getCPU();
    }

}
