package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class OvalActor extends AbstractActor implements Observer {
    private Color color;

    //Konstruktor wird gebraucht, da die moveStrategy mit nach unten gegeben werden muss
    public OvalActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.setColor(this.color);
        graphics.fillOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 45, 25);
        graphics.setColor(Color.white);
    }

    public void inform(){
        this.color = Color.yellow;
    }
}
