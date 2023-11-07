package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class CircleActor extends AbstractActor implements Observer {
    private Color color;

    //Konstruktor wird gebraucht, da die moveStrategy mit nach unten gegeben werden muss
    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.setColor(this.color);
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 20, 20);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform(boolean out) {
        if(out){
            this.color = Color.red;
        } else {
            this.color = Color.green;
        }
    }
}
