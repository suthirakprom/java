import java.util.*;

public class hashMapEx
{
    public static void main (String[] args)
    {
        Map<String, Integer> numberMaping = new HashMap<>();
        numberMaping.put("One", 1);
        numberMaping.put("Two", 2);
        numberMaping.put("Three", 3);
        System.out.println(numberMaping);
        // Add a new key-value pair only 
        //if the key does not exist in the HashMap, or is mapped to `null`
        numberMaping.putIfAbsent("Four", 4);
        System.out.println(numberMaping);
    }
}