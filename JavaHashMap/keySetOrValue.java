import java.util.*;

public class keySetOrValue 
{
    public static void main (String[] args)
    {   
        Map<String, String> husbandWife = new HashMap<>();
        husbandWife.put("Jack", "Marie");
        husbandWife.put("Paul", "Kite");
        husbandWife.put("Mark", "Jenny");

        System.out.println("Husband and Wife: " + husbandWife);
        Set<String> onlyHus = husbandWife.keySet();
        System.out.println("Husbands are: " + onlyHus);
        Collection<String> onlyWife = husbandWife.values();
        System.out.println("Wifes are: " + onlyWife);
    }
}