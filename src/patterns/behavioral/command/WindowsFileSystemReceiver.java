package patterns.behavioral.command;

import java.io.File;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    public void openFile() {
        System.out.println("Opening file in WindowsOS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in WindowsOS");
    }

    @Override
    public void closeFile() {
        System.out.println("CLosing file with WindowsOS");
    }
}









/*
public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in WindowsOS  ");

    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in WindowsOS  ");

    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in WindowsOS  ");

    }
}
*/