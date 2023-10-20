package at.pezze.games.some_game.actors;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class RectActor implements Actor {
    private int x, y;
    private int dir = 0;

    public RectActor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render(Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 50, 50);
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
            this.y++;
            if (this.y >= 500){
                this.dir = 2;
            }
        }
        else if (this.dir == 2){
            this.x--;
            if (this.x <= 100){
                this.dir = 3;
            }
        }
        else if (this.dir == 3){
            this.y--;
            if (this.y <= 100){
                this.dir = 0;
            }
        }
    }

    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
    }

}
