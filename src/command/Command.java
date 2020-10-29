package command;

public class Command {
    public Action action;
    public int amount;
    public boolean success;

    public Command(Action action, int amount) {
        this.action = action;
        this.amount = amount;
    }

    public void call(Account account) {
        switch (action) {
            case DEPOSIT:
                success = true;
                account.balance += amount;
                break;
            case WITHDRAW:
                if (account.balance >= amount) {
                    success = true;
                    account.balance -= amount;
                }
                break;
        }

    }

    enum Action {
        DEPOSIT, WITHDRAW
    }
}