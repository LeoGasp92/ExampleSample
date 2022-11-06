package patterns.behavioral.command;

public class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystemReceiver = fs;
    }

    @Override
    public void execute() {
        fileSystemReceiver.closeFile();
    }
}


/*
public class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;
    public  CloseFileCommand (FileSystemReceiver fs ) {
        fileSystemReceiver = fs;
    }

    @Override
    public void excute() {
        fileSystemReceiver.closeFile();
    }
}
*/