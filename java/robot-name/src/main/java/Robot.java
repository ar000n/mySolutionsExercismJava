import java.util.Random;

public class Robot {
    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String name;

    public Robot() {
        this.name = giveName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        this.name = giveName();
    }

    private static int randomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static String giveName() {
        return ALPHABETS.split("")[randomNumber(0, 25)] + ALPHABETS.split("")[randomNumber(0, 26)]
                + randomNumber(0, 9) + randomNumber(0, 9) + randomNumber(0, 9);
    }
}
