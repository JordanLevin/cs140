package assignment05;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Created by jordan on 2/19/17.
 */
public class CalendarEntry {
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;
    private ChronoUnit period;
    private DayOfWeek day;
    private String description;
    private String location;

    public CalendarEntry(LocalTime startTime, LocalTime endTime, ChronoUnit period){
        this.startTime = startTime;
        this.endTime = endTime;
        this.period = period;
    }

    public boolean meetsOn(LocalDate aDate){
        return date.equals(aDate);
    }

    /**
     Make a copy of this CalendarEntry but with the next later day given by the parameter.
     For example, if this.date is February 20, 2017,
     which is Monday, then copyTo(Friday) should give a CalendarEntry for February 24, 2017.
     @param newDay the day required of the new CapendarEntry
     @return a new CalendarEntry with the date moved so that day matches newDay
     */
    public CalendarEntry copyTo(DayOfWeek newDay) {
        CalendarEntry temp = new CalendarEntry(this.startTime, this.endTime, this.period);
        LocalDate tempDate = date;
        temp.setDescription(description);
        temp.setLocation(location);
        while(tempDate.getDayOfWeek() != newDay){
            System.out.println("debugging " + tempDate);
            tempDate = tempDate.plus(1, DAYS);
        }
        temp.setDate(tempDate);
        return temp;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
        day = date.getDayOfWeek();
    }

    public ChronoUnit getPeriod() {
        return period;
    }

    public void setPeriod(ChronoUnit period) {
        this.period = period;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }
    public String toString(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EE MMMM dd, yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        return this.description + ", " + this.location + ", " +date.format(df) + " from " + startTime.format(tf) + " to " + endTime.format(tf);

    }
}
