import org.joda.time.DateTime;

public class Meetup {

    private final DateTime initialDate;

    public Meetup(int month, int year) {
        initialDate = new DateTime(year, month, 1, 0, 0);
    }

    DateTime day(int dayOfWeek, MeetupSchedule schedule) {
        DateTime currentDate = dateIncrementer(dayOfWeek, initialDate);
        switch (schedule) {
            case FIRST:
                break;
            case SECOND:
                currentDate = currentDate.plusWeeks(1);
                break;
            case THIRD:
                currentDate = currentDate.plusWeeks(2);
                break;
            case FOURTH:
                currentDate = currentDate.plusWeeks(3);
                break;
            case TEENTH:
                while (currentDate.getDayOfMonth() < 13) {
                    currentDate = currentDate.plusWeeks(1);
                }
                break;
            case LAST:
                currentDate = dateDecrementer(dayOfWeek, initialDate.plusMonths(1).minusDays(1));
                break;
            default:
                return null;
        }
        return currentDate;
    }

    private DateTime dateDecrementer(int dayOfWeek, DateTime current) {
        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.minusDays(1);
        }
        return current;
    }

    private DateTime dateIncrementer(int dayOfWeek, DateTime current) {
        while (current.getDayOfWeek() != dayOfWeek) {
            current = current.plusDays(1);
        }
        return current;
    }
}