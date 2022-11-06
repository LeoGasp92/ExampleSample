package oop;

public class Triangle {

    //Fields
    private double a;
    private double b;
    private double c;


    // Methods


    //Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Getters

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    private boolean isValid(double a,double b , double c){
        return a + b > c && b + c > a && a + c > b;
    }
    // private boolean isValid() {return a + b > c && b + c > a && a + c > b;}


    public void areaOfTriangle() {
        if (isValid(a,b,c)) {
            double s = (a+b+c)/2;
            double rootArea = (s*(s-a)*(s-b)*(s-c));
            double areaOfTriangle = Math.sqrt(rootArea);

            System.out.println("Triangle is Valid. " +"\nArea of Triangle = " + areaOfTriangle);
        } else {
            System.out.println("Triangle is not Valid." +"\nArea of Triangle = " + 0.0d );
        }
    }

}


