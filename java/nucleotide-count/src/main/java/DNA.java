import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class DNA {
    private final Map<Character, Integer> nucleotideMap = new HashMap<>();
    private final String dnaPattern;

    public DNA(String dnaPattern) {
        this.dnaPattern = dnaPattern;
        nucleotideMap.put('A', 0);
        nucleotideMap.put('C', 0);
        nucleotideMap.put('G', 0);
        nucleotideMap.put('T', 0);
        if (!dnaPattern.isEmpty()) {
            countNucleotides();
        }
    }


    private void countNucleotides() {
        for (Character e : dnaPattern.toCharArray()) {
            nucleotideMap.put(e, nucleotideMap.get(e) + 1);
        }
    }

    public int count(char nucleotide) {
        if (!nucleotideMap.containsKey(nucleotide)) {
            throw new IllegalArgumentException("Invalid nucleotide");
        }
        return nucleotideMap.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return Collections.unmodifiableMap(nucleotideMap);
    }
}