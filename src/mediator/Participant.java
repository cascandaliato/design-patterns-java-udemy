package mediator;

public class Participant {
    private final Mediator mediator;
    public int value;

    public Participant(Mediator mediator) {
        this.value = 0;
        this.mediator = mediator;
        mediator.subscribe(this);
    }

    public void say(int n) {
        mediator.broadcast(this, n);
    }

    public void onMessage(int n) {
        this.value += n;
    }
}