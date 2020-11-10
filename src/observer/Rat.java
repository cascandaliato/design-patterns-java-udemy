package observer;

import java.io.Closeable;

public class Rat implements Closeable {
    private final Game game;
    public int attack = 1;

    public Rat(Game game) {
        this.game = game;
        game.ratJoined(this);
    }

    @Override
    public void close() {
        game.ratDied(this);
    }
}