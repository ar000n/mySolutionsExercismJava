import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<>();
        old.entrySet().stream()
                .forEach(e -> e.getValue().stream()
                        .forEach(v -> newMap.put(v.toLowerCase(), e.getKey()))
                );
        return newMap;
    }
}
