package at.pezze.games.some_game.actors;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class OvalActor implements Actor {
    private int x, y;
    private int dir = 0;

    public OvalActor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render(Graphics graphics) throws SlickException {
        graphics.drawOval(this.x, this.y, 100, 50);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.dir == 0){
            this.x++;
            if (this.x >= 700){
                this.dir = 1;
            }
        }
        else if (this.dir == 1){
            this.x--;
            if (this.x <= 0) {
                this.dir = 0;
            }
        }
    }

    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
    }

}
