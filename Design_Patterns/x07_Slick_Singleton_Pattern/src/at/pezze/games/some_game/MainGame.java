package at.pezze.games.some_game;

import at.pezze.games.some_game.actors.*;
import at.pezze.games.some_game.singleton.CounterSingleton;
import at.pezze.games.some_game.strategies.MoveLeft;
import at.pezze.games.some_game.strategies.MoveRight;
import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // wird gezeichnet
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn

        //Strategies:
        MoveStrategy mr1 = new MoveRight(0, 500, 0.2f);
        MoveStrategy ml1 = new MoveLeft(600, 0, 0.1f);
        MoveStrategy ml2 = new MoveLeft(750, 50, 0.15f);

        this.actors = new ArrayList<>();

        this.actors.add(new CircleActor(mr1));
        this.actors.add(new CircleActor(ml1));
        this.actors.add(new OvalActor(mr1));
        this.actors.add(new RectActor(ml2));


        this.actors.add(new SnowflakeActor(SnowflakeActor.Size.small));
        this.actors.add(new SnowflakeActor(SnowflakeActor.Size.medium));
        this.actors.add(new SnowflakeActor(SnowflakeActor.Size.big));

        // Singleton Pattern
        CounterSingleton cs1 = CounterSingleton.getInstance();
        CounterSingleton cs2 = CounterSingleton.getInstance();

        cs1.increaseCounter();
        cs2.increaseCounter();
        // Jetzt sollte bei beiden cs dasselbe Ergebnis ausgegeben werden -> 2
        // Es wird ja dieselbe Instanz/Objekt verwendet
        System.out.println("cs1: " + cs1.getCounter());
        System.out.println("cs2: " + cs2.getCounter());
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // delta = Zeit seit dem letzen Aufruf
        for (Actor actor : this.actors) {
            actor.update(gameContainer, delta);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("First Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
