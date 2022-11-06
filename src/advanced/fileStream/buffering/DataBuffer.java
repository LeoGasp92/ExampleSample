package advanced.fileStream.buffering;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.out;

public class DataBuffer
{
    public static void main(String[] args) throws IOException
    {
       /* FileReader fileReader = new FileReader("Data/Input.txt");
        BufferedReader in = new BufferedReader(fileReader); */ // Or we can do it like this ...
        BufferedReader in =  new BufferedReader(new FileReader("Data/Input.txt"));
        ArrayList<String> arrayList = new ArrayList<>();

        //Read Data line by line
        String line;
        while ((line = in.readLine())!= null)
        {
            arrayList.add(line);
            out.println(line);
        }
        System.out.println(arrayList);

        //Write line by line
        BufferedWriter out = new BufferedWriter(new FileWriter("Data/BufferedOutput.txt"));

        //Write string to file
        String data = "Data Buffered Output test file ";
        out.write(data);
        out.close();
    }
}

