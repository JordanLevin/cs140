package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MONTHS;

/**
 * Created by jordan on 2/19/17.
 */
public class Monthly extends CalendarEntry {
    public Monthly(LocalTime startTime, LocalTime endTime, LocalDate date) {
        super(startTime, endTime, MONTHS);
        if(date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        setDate(date);
    }
}
