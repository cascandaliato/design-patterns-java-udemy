package proxy;

public class Main {
    public static void main(String[] args) {
        ResponsiblePerson p = new ResponsiblePerson(new Person(17));
        System.out.println(p.drink());
        System.out.println(p.drive());
        System.out.println(p.drinkAndDrive());
    }
}
