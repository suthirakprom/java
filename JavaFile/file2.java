import java.io.File;
import java.util.*;

public class file2 
{
    public static void main (String[] args)
    {
        //File is only use to check the file
        //if we want to create, we have to use FileWriter instead
        File myFile = new File("text1.txt");
        if (myFile.exists())
        {
            System.out.println("File name: " + myFile.getName());
            System.out.println("File path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in byte: " + myFile.length());
        } 
        else 
        {
            System.out.println("Your file does not exist.");
        }
    }
}