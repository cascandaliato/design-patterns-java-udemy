package command;

public class Account {
    public int balance;

    public void process(Command c) {
        c.call(this);
    }
}