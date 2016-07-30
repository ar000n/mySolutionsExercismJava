import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime date;

    public Gigasecond(LocalDate date) {
        this(date.atStartOfDay());
    }

    public Gigasecond(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date.plusSeconds(1000000000);
    }
}