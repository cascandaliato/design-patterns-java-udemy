package chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Creature> creatures = new ArrayList<>();

    public int query(Statistic statistic, Creature creature) {
        Integer s = creature.getBaseStatistic(statistic);
        for (Creature c : creatures) {
            if (!c.equals(creature)) {
                s = c.getModifier(statistic).apply(s);
            }
        }
        return s;
    }
}