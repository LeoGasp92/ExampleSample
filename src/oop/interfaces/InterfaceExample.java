package oop.interfaces;

interface Bug {
    public void bugSound();
    public void bugSize();
}
interface  Location{
    public void location();
}
class Ant implements Bug,Location{
    @Override
    public void bugSound() {
        System.out.println("BzZzZzZzZz");
    }
    @Override
    public void bugSize() {
        System.out.println("Small");
    }

    @Override
    public void location() {
        System.out.println("Forest");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();

    }
}


/*
interface Bug{

// is similar to abstract , so here instead of writing public abstract class Bug{} just interface Bug{}

    public void bugSound(); // its abstract by default.
    public void bugSize();
}

interface Location{
    public void location();
}
class Ant implements Bug,Location{
    public void bugSound(){
        System.out.println("Bug sound: " + "Tsss");
    }
    public void bugSize(){
        System.out.println("Small");
    }

    @Override
    public void location() {
        System.out.println("Forest");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSound();
        ant.location();
    }
}
*/