package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class RectActor extends AbstractActor implements Observer {
    private Color color;

    //Konstruktor wird gebraucht, da die moveStrategy mit nach unten gegeben werden muss
    public RectActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.setColor(this.color);
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 40, 40);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.pink;
    }
}
