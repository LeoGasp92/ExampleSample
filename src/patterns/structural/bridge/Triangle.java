package patterns.structural.bridge;

public class Triangle extends Shape { // we are going to create a default constructor as we have a custom constructor in Shape abstract class (applyColor)

    public Triangle(Color c){
        super(c);

    }

    @Override
    public void applyColor() {
        System.out.print("Triangle is filled with color ");
        color.applyColor();
    }
}


/*
public class Triangle extends Shape{

    public Triangle(Color c){
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle is filled with color : ");
        color.applyColor();
    }
}
*/