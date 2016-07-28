
public class PhoneNumber {
    private String number;

    public PhoneNumber(String text) {
        this.number = convertToNumber(text);

    }

    public String getNumber() {
        return number;
    }

    public String getAreaCode() {
        return this.number.substring(0, 3);
    }

    public String pretty() {

        return "(" + this.number.substring(0, 3) + ") " + this.number.substring(3, 6) + "-" + this.number.substring(6, 10);
    }

    private static String convertToNumber(String text) {
        String numbers = text.replaceAll("\\D+", "");
        if (numbers.startsWith("11"))
            return numbers.substring(1, 11);
        if (numbers.length() != 10)
            return "0000000000";
        return numbers;
    }

}
