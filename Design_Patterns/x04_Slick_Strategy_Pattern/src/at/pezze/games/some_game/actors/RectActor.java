package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class RectActor extends AbstractActor {
    //Konstruktor wird gebraucht, da die moveStrategy mit nach unten gegeben werden muss
    public RectActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 40, 40);
    }
}
