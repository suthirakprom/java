import java.util.*;

public class iterate
{
    public static void main (String[] args)
    {
        Map<String, Integer> employeeSal = new HashMap<>();
        employeeSal.put("Jin", 200);
        employeeSal.put("Somnang", 300);
        employeeSal.put("Yanty", 500);
        employeeSal.put("Rey", 1000);

        //  every method down here will print the same output
        //  this is just a many different ways to write the program

        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        employeeSal.forEach((employee, salary) -> {
            System.out.println(employee + " => $" + salary);
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Integer>> employeeSalEntries = employeeSal.entrySet();
        Iterator<Map.Entry<String, Integer>> employeeSalIterator = employeeSalEntries.iterator();
        while (employeeSalIterator.hasNext())
        {
            Map.Entry<String, Integer> entry = employeeSalIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        employeeSal.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");
        for(Map.Entry<String, Integer> entry: employeeSal.entrySet())
        {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        employeeSal.keySet().forEach(employee -> {
            System.out.println(employee + " => " + employeeSal.get(employee));
        });
    }
}