package advanced.fileStream.buffering;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferedExample
{

    public static void main(String[] args) throws IOException {


        String inputFileName = "Data/Input.txt";
        String outputFileName = "Data/OutputExample.txt";

        readfile(inputFileName);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text : ");
        String input = scanner.nextLine();

        writeFile(outputFileName,input);
        readfile(outputFileName);
    }


        //Method for reading data
        //Input : String(file name)

        //Methhod for writing Data
        //Input : String (file name ) , String ( data )



     public static void readfile(String strFile) throws IOException
     {
         BufferedReader in = new BufferedReader(new FileReader(strFile));
         String line;

         while ((line = in.readLine()) != null)
         {
             System.out.println(line);
         }
     }
    public static void writeFile(String strFile, String data) throws IOException
    {
        BufferedWriter out = new BufferedWriter(new FileWriter(strFile));
        out.write(data);
        out.close();


    }
}





/*
public class BufferedExample
{
    public static void main(String[] args) throws IOException
    {
        String inputFileName = "Data/Input.txt";
        String outputFileName = "Data/Output.txt";
        readFile(inputFileName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Text : ");
        String input = scanner.nextLine();

        //writeFile(outputFileName,input);
        writefile(outputFileName,input);
        readFile(outputFileName);

    }
    // Method for reading data , Input : String (File Name)
        public static void readFile(String strFile) throws IOException
        {
            String line;
            BufferedReader in = new BufferedReader(new FileReader(strFile));
            while ((line = in.readLine()) != null)
            {
               System.out.println(line);
            }
        }

    //Method for writing data , Input : String (file name ), String (data)

    public static void writefile(String strFile,String data) throws IOException
    {
        BufferedWriter out = new BufferedWriter(new FileWriter(strFile));
        out.write(data);
        out.close();
    }
}

*/