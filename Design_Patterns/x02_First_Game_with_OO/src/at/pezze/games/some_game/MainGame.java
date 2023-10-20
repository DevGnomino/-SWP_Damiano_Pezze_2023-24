package at.pezze.games.some_game;

import at.pezze.games.some_game.actors.CircleActor;
import at.pezze.games.some_game.actors.OvalActor;
import at.pezze.games.some_game.actors.RectActor;
import com.sun.tools.javac.Main;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private CircleActor ca1;
    private CircleActor ca2;
    private OvalActor oa1;
    private RectActor ra1;
    private List<CircleActor> circleActors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // wird gezeichnet
        for (CircleActor ca : circleActors) {
            ca.render(graphics);
        }

        this.oa1.render(graphics);
        this.ra1.render(graphics);
        graphics.setBackground(Color.blue);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
        this.circleActors = new ArrayList<>();
        this.ca1 = new CircleActor(375, 0);
        this.ca2 = new CircleActor(275, 0);
        this.addCircles(ca1);
        this.addCircles(ca2);

        this.oa1 = new OvalActor(0, 400);
        this.ra1 = new RectActor(100, 100);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // delta = Zeit seit dem letzen Aufruf
        for (CircleActor ca : circleActors) {
           ca.update(gameContainer, delta);
        }

        this.oa1.update(gameContainer, delta);
        this.ra1.update(gameContainer, delta);

    }

    public void addCircles (CircleActor ca){
        this.circleActors.add(ca);
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
