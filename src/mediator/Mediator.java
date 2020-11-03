package mediator;

import java.util.HashSet;
import java.util.Set;

public class Mediator {
    private final Set<Participant> participants;

    public Mediator() {
        participants = new HashSet<>();
    }

    public void subscribe(Participant participant) {
        participants.add(participant);
    }

    public void broadcast(Participant source, int value) {
        participants.stream().filter(p -> p != source).forEach(p -> p.onMessage(value));
    }
}