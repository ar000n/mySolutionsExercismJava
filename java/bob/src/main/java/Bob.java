
public class Bob {
    public String hey(String message) {
        if (message.replaceAll(" ", "").isEmpty()) {
            return "Fine. Be that way!";
        }
        if (!message.matches(".*[a-zä].*") && (message.matches(".*[A-Z].*"))) {
            return "Whoa, chill out!";
        }
        if (message.indexOf("?") == message.length() - 1) {
            return "Sure.";
        }
        return "Whatever.";
    }
}
