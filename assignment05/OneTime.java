package assignment05;

import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by jordan on 2/19/17.
 */
public class OneTime extends CalendarEntry{
    public OneTime(LocalTime startTime, LocalTime endTime, LocalDate date){
        super(startTime, endTime, null);
        super.setDate(date);
    }
}
