package at.pezze.games.some_game.factory;

import at.pezze.games.some_game.actors.Actor;
import at.pezze.games.some_game.actors.SnowflakeActor;

import java.util.Random;

public class RandomSnowflakeFactory {
    public static Actor getRandomActor(){
        Random random = new Random();
        int number = random.nextInt(3);

        if (number == 0){
            return new SnowflakeActor(SnowflakeActor.Size.small);
        }
        else if (number == 1){
            return new SnowflakeActor(SnowflakeActor.Size.medium);
        }

        return new SnowflakeActor(SnowflakeActor.Size.big);
    }
}
