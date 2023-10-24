package at.pezze.games.some_game.actors;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class PlayerActor implements Actor {
    private float x, y, speed;
    private List<Observer> observers;

    public PlayerActor(float speed) {
        this.x = 400;
        this.y = 300;
        this.speed = 1f;
        this.observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer oval) {
        this.observers.add(oval);
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.fillRect(this.x, this.y, 50, 50);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if(gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x -= (float)delta * speed;
        }

        if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x += (float)delta * speed;
        }

        if (this.x > 700 || this.x < 50) {
            for(Observer observer : this.observers){
                observer.inform();
            }
        }
    }

}
