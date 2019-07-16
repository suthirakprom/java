import java.util.*;

public class treeSetWithCaseInsensitive {
    public static void main(String[] args) {
        SortedSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        students.add("Jin Jason");
        students.add("Samnang");
        students.add("Yanty");
        students.add("Neath");
        students.add("Leo");
        students.add("leo");
        System.out.println("A set if names: " + students);
    }
}