import java.util.*;

public class treeSetWithFunctions {
    public static void main(String[] args)
    {
        TreeSet<String> games = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        games.add("Final Fantasy XV");
        games.add("Final Fantasy XII");
        games.add("Kingdom Heart 3");
        games.add("Harry Potter");
        games.add("Minecraft"); 
        System.out.println("My game collection: " + games);
        //print the size of the collection
        System.out.println("I have " + games.size() + " games");
        //print games with contain function
        String game = "Minecraft";
        if(games.contains(game))
        {
            System.out.println("This collection contains " + game);
        } else {
            System.out.println("I do not have " + game + " in my collection.");
        }
     }
}