package decorator;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setAge(3);
        System.out.println(dragon.crawl());
        System.out.println(dragon.fly());
    }
}
