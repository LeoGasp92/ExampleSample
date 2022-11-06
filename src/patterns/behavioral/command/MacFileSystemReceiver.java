package patterns.behavioral.command;

public class MacFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in MacOS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in MacOS");
    }

    @Override
    public void closeFile() {
        System.out.println("CLosing file with MacOs");
    }
}
/*
public class MacFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in MacOS  ");

    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in MacOS  ");

    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in MacOS  ");

    }
}
*/