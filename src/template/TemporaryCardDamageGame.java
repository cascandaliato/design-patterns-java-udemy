package template;

public class TemporaryCardDamageGame extends CardGame {

    public TemporaryCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        if (attacker.attack >= other.health) {
            other.health = 0;
        }
    }

}
