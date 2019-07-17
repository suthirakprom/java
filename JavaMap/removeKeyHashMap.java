import java.util.*;


public class removeKeyHashMap {
    public static void main (String[] args)
    {
        Map<String, String> husbandWife = new HashMap<>();
        husbandWife.put("Jack", "Marie");
        husbandWife.put("Paul", "Kite");
        husbandWife.put("Mark", "Jenny");

        System.out.println("Husband and Wife: " + husbandWife);

        //remove a Ket from HashMap
        String husband = "Jack";
        String wife = husbandWife.remove(husband);
        System.out.println("The husband: " + husband + " and the wife: " + wife);
        //the output of the original HashMap is removing one element from it
        System.out.println("After removing a key: " + husbandWife);
        //cannot convert string to boolean that's why I can only use 2 argument
        boolean isRemove = husbandWife.remove("Jack", "Marie");
        System.out.println("Is Jack and Marie removed from the HashMap?: " + isRemove);

        //remove return null
        husband = "Paul";
        wife = husbandWife.remove(husband);
        if(wife==null)
            System.out.println("Looks like " + husband + " is not married anyone.");
        else 
            System.out.println("Remove "+husband+" and his wife from the HashMap.");
    }
}