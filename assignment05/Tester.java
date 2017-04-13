package assignment05;

import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by jordan on 2/19/17.
 */
public class Tester {

    public static void main(String[] args){
        CalendarEntry first = new CalendarEntry(LocalTime.of(10, 50), LocalTime.of(11, 50), null);
        first.setDate(LocalDate.of(2017, 1, 18));
        CalendarEntry second = first.copyTo(FRIDAY);
        CalendarEntry third = second.copyTo(MONDAY);


    }
}
