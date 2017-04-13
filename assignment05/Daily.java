package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 * Created by jordan on 2/19/17.
 */
public class Daily extends CalendarEntry {

    private LocalDate endDate;


    public Daily(LocalTime startTime, LocalTime endTime, LocalDate date) {
        super(startTime, endTime, DAYS);
        if(date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        setDate(date);
    }

    public boolean meetsOn(LocalDate aDate){
        if(aDate.isBefore(getDate()) || aDate.isAfter(getDate())){
            return false;
        }
        else{
            return true;
        }
        //I don't see why all this stuff is needed
        /*if(getEndDate()!= null && aDate.isAfter(getEndDate())){
            return false;
        }
        LocalDate temp = getDate();
        while(temp.isBefore(aDate)){
            temp=temp.plusDays(1);
            if(temp.equals(aDate))
                return true;
            if(temp.isAfter(aDate))
                return false;
        }*/
        //return false;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
