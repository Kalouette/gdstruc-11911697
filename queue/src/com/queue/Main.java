package com.queue;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random rand = new Random();
        int matchmaking = 8;
        int level = 100;
        int successfulMatchmaking = 0;

        ArrayQueue queue = new ArrayQueue(5);

        while(successfulMatchmaking < 10)
        {
            int matchmakingRand = rand.nextInt(matchmaking);
            if (matchmakingRand > 4)
            {
                successfulMatchmaking++;
                for (int i = 0; i < matchmakingRand; i++)
                {
                    queue.add(new Player(i + 1, "Player" + i, 120));

                    if(i + 1 == matchmakingRand)
                    {
                        queue.printQueue();
                        System.out.println("Game has started!\n");
                        for(int o = 0; o < 5;o++)
                        {
                            queue.remove();
                        }
                    }
                }
            }
        }
    }
}

