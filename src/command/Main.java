package command;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.process(new Command(Command.Action.DEPOSIT, 42));
        account.process(new Command(Command.Action.WITHDRAW, 20));
        System.out.println(account.balance);
    }
}
