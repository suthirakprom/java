import java.io.FileWriter;
import java.io.IOException;

public class file1 {
    public static void main (String[] args)
    {
        try {
            FileWriter myWriter = new FileWriter("text1.txt");
            myWriter.write("Hello World\n");
            myWriter.write("My name is Jin Jason");
            myWriter.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}