package patterns.behavioral.command;


import java.io.File;

public class FileSystemClient {
    public static void main(String[] args) {


        // Create the receiver Object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Creating Command and associating with receiver
        // Creating Invoker and associating with Command
        // Perform action on Invoker object
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }
}




/*
public class FileSystemClient {
    public static void main(String[] args) {


        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Creating Command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // Creating Invoker and associating with Command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        // Perform action on Invoker object
        fileInvoker.excute();
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.excute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.excute();
    }
}
*/