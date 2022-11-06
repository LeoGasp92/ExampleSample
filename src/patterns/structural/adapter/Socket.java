package patterns.structural.adapter;


public class Socket {
    public Volt getVolt (){
        return new Volt(120);
    }
}




/*
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
*/
