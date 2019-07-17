import java.util.*;

public class accessKeyHashMap {
    public static void main (String[] args)
    {
        Map<String, String> playerGame = new HashMap<>();

        playerGame.put("JinJason", "Vainglory");
        playerGame.put("Breaker", "Mobile Legend");
        playerGame.put("ZED", "Overwatch");
        playerGame.put("Dante", "Devil May Cry");
        System.out.println("Player's names and their games: " + playerGame);
        int size = playerGame.size();
        System.out.println("There are " + size + " players and " 
            + size + " games.");
    }
}