package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Goblin goblin = new Goblin(game);
        game.creatures.add(goblin);
        game.creatures.add(new Goblin(game));
        System.out.println(goblin.getAttack());
        System.out.println(goblin.getDefense());

        GoblinKing goblinKing = new GoblinKing(game);
        game.creatures.add(goblinKing);
        System.out.println(goblin.getAttack());
        System.out.println(goblin.getDefense());
        game.creatures.remove(goblinKing);
        System.out.println(goblin.getAttack());
        System.out.println(goblin.getDefense());
    }
}
