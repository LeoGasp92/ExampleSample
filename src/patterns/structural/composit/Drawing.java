package patterns.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapeList = new ArrayList<>() ; // created shapeList object passing Shape as we want to create a list of shapes

    @Override
    public void draw(String fillColor) {
         for( Shape sh : shapeList){
             sh.draw(fillColor);
         }
    }
    //Adding Shape to drawing
    public void add(Shape s){
        this.shapeList.add(s); // this. is not mandatory here as we only have one variable but better using it
    }
    // Removing shape from drawing
    public void remove(Shape s){
        this.shapeList.remove(s);
    }
    // Removing all shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing.");
        this.shapeList.clear();
    }
}






/*
public class Drawing implements Shape{

    private List <Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapeList){
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s){
        this.shapeList.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s){
        this.shapeList.remove(s);
    }

    //removing all shapes
    public void clear(){
        System.out.println("Clearing all the shapes from Drawing.");
        this.shapeList.clear();
    }
}


*/