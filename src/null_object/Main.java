package null_object;

public class Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account(new NullLog());
        account.someOperation();
        account.someOperation();
        account.someOperation();
    }
}
