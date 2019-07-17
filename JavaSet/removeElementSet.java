import java.util.*;

public class removeElementSet {
    public static void main (String[] args)
    {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(44);
        numbers.add(45);
        numbers.add(46);
        numbers.add(47);
        numbers.add(48);
        numbers.add(49);

        System.out.println("The list of numbers: " + numbers);

        //we cannot use int because it is supposed to be boolean
        //int isRemove = numbers.remove(49);

        boolean isRemove = numbers.remove(49);
        isRemove = numbers.remove(10);
        if(isRemove)
        {
            System.out.println("After 49 is removed: " + numbers);
        }

        //still have to write more code in this file
    }
}