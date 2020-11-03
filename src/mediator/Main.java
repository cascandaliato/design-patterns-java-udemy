package mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Participant participant1 = new Participant(mediator);
        Participant participant2 = new Participant(mediator);
        participant1.say(3);
        System.out.println("P1 = " + participant1.value + " - P2 = " + participant2.value);
        participant2.say(2);
        System.out.println("P1 = " + participant1.value + " - P2 = " + participant2.value);
    }
}
