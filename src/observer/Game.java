package observer;

import java.util.HashSet;
import java.util.Set;

public class Game {
    Set<Rat> rats = new HashSet<>();

    public void ratJoined(Rat rat) {
        rats.add(rat);
        for (Rat r : rats) {
            r.attack = rats.size();
        }
    }

    public void ratDied(Rat rat) {
        rats.remove(rat);
        rat.attack = 1;
        for (Rat r : rats) {
            r.attack = rats.size();
        }
    }
}
