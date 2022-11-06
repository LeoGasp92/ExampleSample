package patterns.behavioral.command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c){
        this.command = c;
    }

    public void execute(){
        command.execute();
    }
}
/*
public class FileInvoker {
    public Command command;
    public FileInvoker(Command c){command = c;}
    public void excute(){
        command.excute();
    }
}


*/