package patterns.structural.composit;

public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drwaing circle with " + fillColor + " color.");
    }
}
/*
public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing circle with color : " + fillColor);
    }
}
*/