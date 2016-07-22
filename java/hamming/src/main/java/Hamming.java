public class Hamming {
    public static int compute(String trand1, String trand2) {
        if (trand1.length() != trand2.length()) {
            throw new IllegalArgumentException();
        }
        String[] splitedtrand2 = trand2.split("");
        String[] splitedTrand1 = trand1.split("");
        int counter = 0;
        for (int i = 0; i < trand1.length(); i++) {
            if (!(splitedTrand1[i].equals(splitedtrand2[i]))) {
                counter++;
            }
        }
        return counter;
    }
}
