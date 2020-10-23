package flyweight;

public class Main {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("foo bar baz");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence);
    }
}
