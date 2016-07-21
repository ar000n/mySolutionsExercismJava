import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    private String word;

    public Anagram(String word) {

        this.word = word.toLowerCase();
    }

    public List<String> match(List<String> wordsList) {

        List<String> result = wordsList.stream()
                .filter(e -> checkEequals(e))
                .collect(Collectors.toList());
        return result;

    }

    private boolean checkEequals(String e) {
        boolean isSameWord = e.toLowerCase().equals(this.word);
        char[] word1 = e.toLowerCase().toCharArray();
        char[] word2 = this.word.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return !isSameWord && Arrays.equals(word1, word2);
    }
}
