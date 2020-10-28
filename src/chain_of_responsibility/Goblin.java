package chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static chain_of_responsibility.Statistic.ATTACK;
import static chain_of_responsibility.Statistic.DEFENSE;

public class Goblin extends Creature {

    protected final Map<Statistic, Function<Integer, Integer>> modifiers = new HashMap<>();
    protected final Map<Statistic, Integer> baseStatistics = new HashMap<>();
    private final Game game;

    public Goblin(Game game) {
        this.game = game;

        modifiers.put(ATTACK, Function.identity());
        modifiers.put(DEFENSE, dfn -> dfn + 1);

        baseStatistics.put(ATTACK, 1);
        baseStatistics.put(DEFENSE, 1);
    }

    @Override
    public Function<Integer, Integer> getModifier(Statistic statistic) {
        return modifiers.get(statistic);
    }

    @Override
    public Integer getBaseStatistic(Statistic statistic) {
        return baseStatistics.get(statistic);
    }

    @Override
    public int getAttack() {
        return game.query(ATTACK, this);
    }

    @Override
    public int getDefense() {
        return game.query(DEFENSE, this);
    }

}

