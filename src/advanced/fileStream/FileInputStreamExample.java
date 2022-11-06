package advanced.fileStream;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream in = new FileInputStream("Data/Input.txt");// in Mac we use (Forward Slash / ) not \\ while inserting File Names.
            int c;
            while ((c =in.read())!= -1)
            {
                System.out.print((char) c);
            }
        }
        catch(IOException e )
        {
            System.out.println(e);
        }
    }
}




/*
public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("Data/Input.txt");
            int c;

            while((c = in.read()) != -1){
                System.out.print((char)c);
            }
        }catch(IOException e ){
            System.out.println(e);
        }
    }
}
*/