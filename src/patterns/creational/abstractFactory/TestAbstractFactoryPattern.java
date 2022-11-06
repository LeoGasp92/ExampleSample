package patterns.creational.abstractFactory;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        testAbstractFactory();

    }
    private static void testAbstractFactory(){
        Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB","1 TB","3.1GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","5 TB","4.1GHz"));
        System.out.println("Abstract Factory PC config : " + pc);
        System.out.println("Abstract Factory Server config : " + server);
    }
}
