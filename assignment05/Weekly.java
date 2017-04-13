package assignment05;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.WEEKS;
/**
 * Created by jordan on 2/19/17.
 */


public class Weekly extends CalendarEntry {

    private LocalDate endDate;


    public Weekly(LocalTime startTime, LocalTime endTime, LocalDate date) {
        super(startTime, endTime, WEEKS);
        if(date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        setDate(date);
    }
    public boolean meetsOn(LocalDate aDate){
        if(aDate.isBefore(getDate())){
            return false;
        }
        if(getEndDate()!= null && aDate.isAfter(getEndDate())){
            return false;
        }
        LocalDate temp = getDate();
        while(temp.isBefore(aDate)){
            temp=temp.plusWeeks(1);
            if(temp.equals(aDate))
                return true;
            if(temp.isAfter(aDate))
                return false;
        }
        return false;
    }
    public Weekly copyTo(DayOfWeek newDay){
        Weekly temp = new Weekly(getStartTime(), getEndTime(), this.getDate());
        LocalDate tempDate = getDate();
        temp.setDescription(getDescription());
        temp.setLocation(getLocation());
        while(tempDate.getDayOfWeek() != newDay){
            System.out.println("debugging " + tempDate);
            tempDate = tempDate.plus(1, DAYS);
        }
        temp.setDate(tempDate);
        return temp;
    }
    public Weekly copy(LocalDate aDate){
        Weekly temp = new Weekly(this.getStartTime(), this.getEndTime(), aDate);
        temp.setDescription(getDescription());
        temp.setLocation(getLocation());
        return temp;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
