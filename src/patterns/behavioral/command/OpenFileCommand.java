package patterns.behavioral.command;


public class OpenFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;


    public OpenFileCommand (FileSystemReceiver fs){
        this.fileSystemReceiver = fs;
    }


    @Override
    public void execute() {
        fileSystemReceiver.openFile();

    }
}
/*
public class OpenFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fs){
        fileSystemReceiver = fs; // or this.fileSystemReceiver = fs;
    }
    @Override
    public void excute() {
        fileSystemReceiver.openFile();
    }
}
*/