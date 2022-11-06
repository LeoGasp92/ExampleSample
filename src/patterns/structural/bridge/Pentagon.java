package patterns.structural.bridge;

public class Pentagon extends Shape{
    public Pentagon (Color c ){
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon is filled with color ");
        color.applyColor();
    }
}

/*
public class Pentagone extends Shape{
    public Pentagone(Color c){
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon is filled with color : ");
        color.applyColor();
    }
}
*/