package geometry;

public class Square extends Rectangle
{
    private float side;

    public Square(float side)
    {
        super(side,side);
        this.side = side;
    }

    public float getSide()
    {
        return side;
    }
}












/*
public class Square extends Rectangle {
    private float side;

    public Square(float side) {
        super(side,side);// passing over the parimeters of the rectangle
        this.side = side;
    }
    public float getSide(){
        return side;
    }
}
*/