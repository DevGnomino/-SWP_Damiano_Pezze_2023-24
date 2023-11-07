package at.pezze.games.some_game;

import at.pezze.games.some_game.actors.*;
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

        CircleActor ca1 = new CircleActor(mr1);
        CircleActor ca2 = new CircleActor(mr1);
        CircleActor ca3 = new CircleActor(ml1);
        OvalActor oa1 = new OvalActor(mr1);
        RectActor ra1 = new RectActor(ml2);
        this.actors.add(ca1);
        this.actors.add(ca2);
        this.actors.add(ca3);
        this.actors.add(oa1);
        this.actors.add(ra1);


        PlayerActor pl = new PlayerActor();
        pl.addObserver(ca1);
        pl.addObserver(ca2);
        pl.addObserver(ca3);
        pl.addObserver(oa1);
        pl.addObserver(ra1);
        this.actors.add(pl);



        this.actors.add(new SnowflakeActor(SnowflakeActor.Size.small));
        this.actors.add(new SnowflakeActor(SnowflakeActor.Size.medium));
        this.actors.add(new SnowflakeActor(SnowflakeActor.Size.big));

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
