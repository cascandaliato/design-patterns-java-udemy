package chain_of_responsibility;

import java.util.function.Function;

public abstract class Creature {
    public abstract Function<Integer, Integer> getModifier(Statistic statistic);

    public abstract Integer getBaseStatistic(Statistic statistic);

    public abstract int getAttack();

    public abstract int getDefense();

}