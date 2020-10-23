package flyweight;

import java.util.Arrays;

public class Sentence {

    private final WordToken[] wordTokens;

    public Sentence(String plainText) {
        wordTokens = Arrays.stream(plainText.split(" ")).map(WordToken::new).toArray(WordToken[]::new);
    }

    public WordToken getWord(int index) {
        return wordTokens[index];
    }

    @Override
    public String toString() {
        String[] words = new String[wordTokens.length];
        for (int i = 0; i < wordTokens.length; i++) {
            WordToken wt = wordTokens[i];
            words[i] = wt.capitalize ? wt.word.toUpperCase() : wt.word;
        }
        return String.join(" ", words);
    }

    class WordToken {
        private final String word;
        public boolean capitalize;

        public WordToken(String word) {
            this.word = word;
        }
    }
}