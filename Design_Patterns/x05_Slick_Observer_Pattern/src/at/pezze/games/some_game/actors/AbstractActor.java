package at.pezze.games.some_game.actors;

import at.pezze.games.some_game.strategies.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public abstract class AbstractActor implements Actor{
    // ist zwar ein Actor, braucht aber nicht die Funktionen eines Actors
    /* Man programmiert manche Dinge, die man nicht wiederholt programmieren will/muss.
     * Man weiß ja hier z.B. noch nicht, ob man ein Circle oder Rect ist ->  das render
     * kann gar nicht hier schon gemacht werden. Das muss dann z.B. der Circle selbst machen. */
    // Kurz: Manche Dinge sind gemacht (allgemein benötigte Funktionen), manche nicht (individuelle Funktionen)

    protected MoveStrategy moveStrategy; //mit protected kann man darauf dann z.B. von der Circle Klasse zugreifen

    public AbstractActor(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        moveStrategy.update(delta);
    }
}
