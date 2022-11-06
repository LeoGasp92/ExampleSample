package patterns.structural.bridge;


public class BridgePatternTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();
        System.out.println(triangle + " > So why we have this result ? ");

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}

/*
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();
        Shape pentagon = new Pentagone(new GreenColor());
        pentagon.applyColor();
    }
}
*/