
public class Bob {
    public String hey(String message) {
        if (message.trim().isEmpty()) {
            return "Fine. Be that way!";
        }
        if (!message.matches(".*[a-zä].*") && (message.matches(".*[A-Z].*"))) {
            return "Whoa, chill out!";
        }
        if (message.endsWith("?")) {
            return "Sure.";
        }
        return "Whatever.";
    }
}
