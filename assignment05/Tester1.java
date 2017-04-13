package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.DayOfWeek.FRIDAY;


/**
 * Created by jordan on 2/20/17.
 */
public class Tester1 {
    public static void main(String[] args){
        Weekly test = new Weekly(LocalTime.of(10, 50), LocalTime.of(11, 50), LocalDate.of(2017, 1, 18));
        test.setEndDate(LocalDate.of(2017, 5, 9));
        for(LocalDate d = test.getDate(); d.isBefore(LocalDate.of(2017, 5, 10)); d = d.plusDays(1)) {
            if(test.meetsOn(d)) {
                System.out.println(test.copy(d));
            }
        }

        /*Weekly test1 = new Weekly(LocalTime.of(10, 50), LocalTime.of(11, 50), LocalDate.of(2017, 1, 18));
        test1.setEndDate(LocalDate.of(2017, 5, 9));
        test1.setDescription("CS 140 Class");
        test1.setLocation("UU 108");

        Weekly test2 = test1.copyTo(FRIDAY);

        Daily d1 = new Daily(LocalTime.of(0, 1),LocalTime.of(23, 59), LocalDate.of(2017, 3, 3));
        d1.setEndDate(LocalDate.of(2017, 3, 7));*/
    }
}
