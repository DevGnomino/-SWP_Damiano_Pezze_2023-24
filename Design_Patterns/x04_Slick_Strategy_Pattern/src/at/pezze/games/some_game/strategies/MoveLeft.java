package at.pezze.games.some_game.strategies;

public class MoveLeft implements MoveStrategy {
    private float x, y;
    private float speed;

    public MoveLeft(float x, float y, float speed) {
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void update (int delta) {
        this.x -= delta * speed;
        if (this.x <= 0) {
            this.x = 800;
        }
    }
}
