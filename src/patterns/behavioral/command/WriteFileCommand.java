package patterns.behavioral.command;



public class WriteFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystemReceiver = fs;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();

    }
}

/*
public class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;
    public  WriteFileCommand (FileSystemReceiver fs ) {
        fileSystemReceiver = fs;
    }

    @Override
    public void excute() {
        fileSystemReceiver.writeFile();
    }
}

*/