import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class synchronizing 
{
    public static void main(String[] args) throws InterruptedException
    {
        Map<String, Integer> cricketTeamScore = new HashMap<>();
        cricketTeamScore.put("Cambodia", 300);
        cricketTeamScore.put("Thailand", 341);

        //  create an ExecutorService with a Thread Pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        Runnable task = () -> {
            incrementTeamScore(cricketTeamScore, "Cambodia");
        };

        for(int i=0; i<100; i++)
        {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score of Team Cambodia: " + cricketTeamScore.get("Cambodia"));
    }

    private static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team)
    {
        Integer score = cricketTeamScore.get(team);
        cricketTeamScore.put(team, score +1);
    }
}
