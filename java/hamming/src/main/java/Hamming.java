public class Hamming {
    public static int compute(String trand1, String trand2) {
        if (trand1.length() != trand2.length()) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        for (int i = 0; i < trand1.length(); i++) {
            if (trand1.charAt(i) != trand2.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
