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
        
        String userName = "ZED"; 
        //check if the key exist
        if(playerGame.containsKey(userName))
        {
            String game = playerGame.get(userName);
            System.out.println(userName + " plays " + game + ".");
        } else {
            System.out.println("Game details not found for player: " + userName);
        }
        //check if the value exist in a HashMap
        String myGame = "OverWatch";
        if(playerGame.containsValue(myGame))
        {
            System.out.println("There is a player who plays " + myGame);
        } else {
            System.out.println("There is no one play " + myGame + ". Your game sucks.");
        }
        //modify the value to an existing key
        playerGame.put("JinJason", "Minecraft");
        System.out.println("JinJason has now plays " + playerGame.get("JinJason") + ".");
        //Call the key that was not found in the HashMap
        System.out.println("Lisa plays " + playerGame.get("Lisa"));
        //putting lisa in the HashMap
        playerGame.put("Lisa", "Candy Crush");
        System.out.println("Lisa plays " + playerGame.get("Lisa") + ".");
    }
}