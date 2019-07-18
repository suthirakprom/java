import java.util.*;
import java.io.*;

public class file3 {
    public static void main (String[] args)
    {
        try {
            File obj = new File("text1.txt");
            Scanner myReader = new Scanner(obj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    }
}