package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class RectActor extends AbstractActor implements Observer {
    //Konstruktor wird gebraucht, da die moveStrategy mit nach unten gegeben werden muss
    private Color color;

    public RectActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.setColor(this.color);
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 40, 40);
        graphics.setColor(Color.white);
    }

    public void inform(boolean out) {
        if(out){
            this.color = Color.orange;
        } else {
            this.color = Color.green;
        }
    }
}
