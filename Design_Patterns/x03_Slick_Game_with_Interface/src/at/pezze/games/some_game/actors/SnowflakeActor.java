package at.pezze.games.some_game.actors;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import java.util.Random;

public class SnowflakeActor implements Actor{
    private int width;
    private int height;
    private float x;
    private float y;
    private float speed;
    private int dir = 0;
    Random rand;

    private Size size;
    public enum Size {
        small, medium, big;
    }

    public SnowflakeActor(Size size) {
        super();
        this.rand = new Random();
        this.x = rand.nextInt(800) + 1;
        this.y = rand.nextInt(100);
        this.size = size;
        this.speed = rand.nextInt(1000) * 0.0002f;

        if(this.size == Size.small){
            this.width = this.height = 10;
        } else if(this.size == Size.medium){
            this.width = this.height = 25;
        } else if(this.size == Size.big){
            this.width = this.height = 40;
        }
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.setColor(Color.white);
        graphics.fillOval((int)this.x, (int)this.y, this.width, this.height);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.dir == 0){
            this.y += delta * speed;
            if (this.y >= 600){
                this.dir = 1;
            }
        }
        else if (this.dir == 1){
            this.y = 0;
            this.dir = 0;
        }
    }

    public void init(GameContainer gameContainer) throws SlickException {
        // 1 mal aufgerufen am Beginn
    }
}
