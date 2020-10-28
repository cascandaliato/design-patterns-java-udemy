package chain_of_responsibility;

import static chain_of_responsibility.Statistic.ATTACK;
import static chain_of_responsibility.Statistic.DEFENSE;

public class GoblinKing extends Goblin {
    public GoblinKing(Game game) {
        super(game);

        modifiers.put(ATTACK, atk -> atk + 1);

        baseStatistics.put(ATTACK, 3);
        baseStatistics.put(DEFENSE, 3);
    }
}