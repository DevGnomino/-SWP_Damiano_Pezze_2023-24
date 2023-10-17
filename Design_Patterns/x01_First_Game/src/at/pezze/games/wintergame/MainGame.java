package at.pezze.games.wintergame;

import com.sun.tools.javac.Main;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class MainGame extends BasicGame {
    private int rectX, rectY, circleX, circleY, ovalX, ovalY;
    private int degreeX, degreeY;
    private int rectDir = 0; // 0:right, 1:down, 2:left, 3:up
    private int circleDir = 0;
    private int ovalDir = 0;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        // wird gezeichnet
        graphics.drawRect(this.rectX, this.rectY, 50, 50);
        graphics.drawOval(this.circleX, this.circleY, 50, 50);
        graphics.drawOval(this.ovalX, this.ovalY, 100, 50);
        graphics.setBackground(Color.blue);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
        this.rectX = 100;
        this.rectY = 100;
        this.circleX = 375;
        this.circleY = 0;
        this.ovalX = 0;
        this.ovalY = 400;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        // delta = Zeit seit dem letzen Aufruf

        //rectangle Movement
        if (this.rectDir == 0){
            this.rectX++;
            if (this.rectX >= 700){
                this.rectDir = 1;
            }
        }
        else if (this.rectDir == 1){
            this.rectY++;
            if (this.rectY >= 500){
                this.rectDir = 2;
            }
        }
        else if (this.rectDir == 2){
            this.rectX--;
            if (this.rectX <= 100){
                this.rectDir = 3;
            }
        }
        else if (this.rectDir == 3){
            this.rectY--;
            if (this.rectY <= 100){
                this.rectDir = 0;
            }
        }

        //circle Movement
        if (this.circleDir == 0){
            this.circleY++;
            if (this.circleY >= 600){
                this.circleDir = 1;
            }
        }
        else if (this.circleDir == 1){
            this.circleY = 0;
            this.circleDir = 0;
        }

        //oval Movement
        if (this.ovalDir == 0){
            this.ovalX++;
            if (this.ovalX >= 700){
                this.ovalDir = 1;
            }
        }
        else if (this.ovalDir == 1){
            this.ovalX--;
            if (this.ovalX <= 0) {
                this.ovalDir = 0;
            }
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
