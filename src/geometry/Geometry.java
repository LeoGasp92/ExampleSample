package geometry;

import org.w3c.dom.css.Rect;

public class Geometry
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.area();
        rectangle.perimeter();

        Square square = new Square(6);
        square.area();
        square.perimeter();
        System.out.println(square.getSide());

    }
}










/*
public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.area();
        rectangle.perimeter();

        Square square = new Square(6);
        square.area();
        square.perimeter();
        System.out.println(square.getSide());
    }
}
*/