package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class RectActor implements Actor {
    private MoveStrategy moveStrategy;

    public RectActor(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void render(Graphics graphics) throws SlickException {
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        moveStrategy.update(delta);
    }

    public void init(GameContainer gameContainer) throws SlickException {
    }

}
