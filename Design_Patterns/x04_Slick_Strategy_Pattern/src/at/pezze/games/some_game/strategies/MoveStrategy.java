package at.pezze.games.some_game.strategies;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(int delta);
}
