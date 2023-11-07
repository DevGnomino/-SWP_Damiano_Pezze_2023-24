package at.pezze.games.some_game.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import java.util.ArrayList;
import java.util.List;

public class PlayerActor implements Actor{
    private float x, y, speed;
    private List<Observer> observers;

    public PlayerActor() {
        this.x = 300;
        this.y = 300;
        this.speed = 1f;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.fillRect(this.x, this.y, 50, 50);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float)delta * speed;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += (float)delta * speed;
        }

        if (this.x > 700 || this.x < 100){
            informObservers(true);
        } else {
            informObservers(false);
        }
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    private void informObservers(boolean out){
        for (Observer observer:observers) {
            observer.inform(out);
        }
    }
}
