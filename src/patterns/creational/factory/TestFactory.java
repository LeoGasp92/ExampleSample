package patterns.creational.factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","16 GB","500 GB","2.4GHz");
        Computer server = ComputerFactory.getComputer("server","32 GB", "2 TB","2.9GHz");

        System.out.println("Factory PC config : " + pc);
        System.out.println("Factory Server config : " + server);
    }
}
