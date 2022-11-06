package geometry;

public class Rectangle
{
    protected float length;
    protected float width;

    public Rectangle(float length,float width)
    {
        this.length = length;
        this.width = width;
    }
    public void area ()
    {
        System.out.println("Area : " + length * width);
    }
    public void perimeter()
    {
        System.out.println("Perimeter : " + 2 * (length + width));
    }
}


/*
public class Rectangle {

    protected float length;
    protected float width;

    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;

    }

    public void area (){
        System.out.println("Area : " + length * width);
    }

    public void perimeter(){
        System.out.println("Perimeter : " + 2*(length+width));
    }
}
*/