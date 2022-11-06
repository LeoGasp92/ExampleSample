
class Parent{
    // when creating class description , we will create object, therefore void.
    public void printParent(){
        System.out.println("This is parent class. ");
    }
}

// Creating subclass that will inherit from the Parent Class
class Child extends Parent{
    public void printChild(){
        System.out.println("This is child class. ");
    }

}

//Calling Class and it is the only one that can be public if we will create other smaller classes in the same file.
public class SubClassIntro {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printParent();
        child.printChild();
    }
}
