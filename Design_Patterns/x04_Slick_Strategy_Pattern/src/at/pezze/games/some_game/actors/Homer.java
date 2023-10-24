package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Homer extends AbstractActor{
    public Homer(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.drawString("HI I AM HOMER", this.moveStrategy.getX(), this.moveStrategy.getY());
    }
}
