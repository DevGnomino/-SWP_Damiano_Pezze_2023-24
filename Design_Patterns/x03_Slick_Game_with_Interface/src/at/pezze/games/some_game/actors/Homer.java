package at.pezze.games.some_game.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Homer implements Actor{
    @Override
    public void render(Graphics graphics) throws SlickException {
        graphics.drawString("I am Homer", 50, 50);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }
}
