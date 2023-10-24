package at.pezze.games.some_game;

import at.pezze.games.some_game.actors.*;
import com.sun.tools.javac.Main;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

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
        this.actors = new ArrayList<>();
        this.actors.add(new CircleActor(375, 0));
        this.actors.add(new OvalActor(0, 400));
        this.actors.add(new RectActor(100, 100));
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
