import java.util.TreeSet;
import java.util.SortedSet;


public class treeSet {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Dragon fruit");
        System.out.println("A set of fruits: "+ fruits); 
    }
}