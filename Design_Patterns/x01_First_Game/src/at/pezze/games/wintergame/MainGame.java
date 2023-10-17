package at.pezze.games.wintergame;

import com.sun.tools.javac.Main;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private int x,y;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // wird gezeichnet
        graphics.drawRect(this.x, this.y, 50, 50);
        graphics.setBackground(Color.blue);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
        this.x = 50;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // delta = Zeit seit dem letzen Aufruf
        this.x++;
        if (this.x >= 700) {
            this.x = 100;
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
