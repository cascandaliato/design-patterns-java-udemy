package memento;

import java.util.ArrayList;
import java.util.List;

public class TokenMachine {
    public List<Token> tokens = new ArrayList<>();

    public Memento addToken(int value) {
        tokens.add(new Token(value));
        return snapshot();
    }

    public Memento addToken(Token token) {
        tokens.add(token);
        return snapshot();
    }

    public void revert(Memento m) {
        tokens = m.tokens;
    }

    private Memento snapshot() {
        Memento memento = new Memento();
        tokens.forEach(t -> memento.tokens.add(new Token(t.value)));
        return memento;
    }
}
