import java.util.Arrays;

/**
 * Created by arun on 7/19/16.
 */
public class Pangrams {
    public static boolean isPangram(String text) {
        String[] charArray = text.toLowerCase().replaceAll("[^a-z]", "").split("");
        wordStream()
        return Arrays.stream(charArray)
                .distinct()
                .toArray().length == 26;
    }
}


