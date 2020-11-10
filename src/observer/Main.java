package observer;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Rat r1 = new Rat(game);
        System.out.println("r1 = " + r1.attack);
        Rat r2 = new Rat(game);
        System.out.println("r1 = " + r1.attack);
        r2.close();
        System.out.println("r1 = " + r1.attack);
    }
}
