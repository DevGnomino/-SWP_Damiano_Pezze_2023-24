package at.pezze.games.some_game;

import at.pezze.games.some_game.actors.CircleActor;
import at.pezze.games.some_game.actors.OvalActor;
import at.pezze.games.some_game.actors.RectActor;
import at.pezze.games.some_game.actors.SnowflakeActor;
import com.sun.tools.javac.Main;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private CircleActor ca1;
    private OvalActor oa1;
    private RectActor ra1;
    private SnowflakeActor sf1;
    private SnowflakeActor sf2;
    private SnowflakeActor sf3;
    private List<SnowflakeActor> snowflakes;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // wird gezeichnet
        for (SnowflakeActor sf : this.snowflakes) {
            sf.render(graphics);
        }

        this.oa1.render(graphics);
        this.ca1.render(graphics);
        this.ra1.render(graphics);
        graphics.setBackground(Color.darkGray);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
        this.sf1 = new SnowflakeActor(SnowflakeActor.Size.small);
        this.sf2 = new SnowflakeActor(SnowflakeActor.Size.medium);
        this.sf3 = new SnowflakeActor(SnowflakeActor.Size.big);
        this.snowflakes = new ArrayList<>();
        this.addSnowflakes(sf1);
        this.addSnowflakes(sf2);
        this.addSnowflakes(sf3);
        System.out.println(this.snowflakes);

        this.ca1 = new CircleActor(375, 0);
        this.oa1 = new OvalActor(0, 400);
        this.ra1 = new RectActor(100, 100);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // delta = Zeit seit dem letzen Aufruf
        for (SnowflakeActor sf : snowflakes) {
           sf.update(gameContainer, delta);
        }

        this.oa1.update(gameContainer, delta);
        this.ra1.update(gameContainer, delta);
        this.ca1.update(gameContainer, delta);

    }

    public void addSnowflakes (SnowflakeActor sf){
        this.snowflakes.add(sf);
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
