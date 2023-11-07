package at.pezze.games.some_game;

import at.pezze.games.some_game.actors.*;
import at.pezze.games.some_game.factory.RandomSnowflakeFactory;
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
        this.actors = new ArrayList<Actor>();
        
        for (int i = 0; i < 15; i++){
            this.actors.add(RandomSnowflakeFactory.getRandomActor());
        }

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
