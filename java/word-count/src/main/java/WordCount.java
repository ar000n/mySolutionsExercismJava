import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public Map<String, Integer> phrase(String word) {
        String[] words = word.replaceAll("\\W"," ").trim().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();
        Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s.toLowerCase()))
                .forEach((k, v) -> wordCountMap.put(k,v.size()));
        return wordCountMap;
    }
}
