package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by jordan on 2/21/17.
 */
public class Tester2 {
    public static void main(String[] args){
        ClassSchedule cs = new ClassSchedule();
        Weekly temp = new Weekly(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,1,16));
        temp.setEndDate(LocalDate.of(2017, 5, 9));
        temp.setDescription("CS 140 Class");
        temp.setLocation("UU 108");
        cs.addClassDay(temp);
        Weekly temp2 = new Weekly(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,1,18));
        temp2.setEndDate(LocalDate.of(2017, 5, 11));
        temp2.setDescription("CS 140 Class");
        temp2.setLocation("UU 108");
        cs.addClassDay(temp2);
        Weekly temp3 = new Weekly(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,1,20));
        temp3.setEndDate(LocalDate.of(2017, 5, 13));
        temp3.setDescription("CS 140 Class");
        temp3.setLocation("UU 108");
        cs.addClassDay(temp3);
        Weekly lab = new Weekly(LocalTime.of(16, 25, 0), LocalTime.of(17, 50, 0), LocalDate.of(2017,1,19));
        lab.setEndDate(LocalDate.of(2017, 5, 9));
        lab.setDescription("CS 140 Lab");
        lab.setLocation("LSG 103");
        cs.addClassDay(lab);
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,3,3)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,3,6)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,8)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,9)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,10)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,11)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,12)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,13)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,14)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,15)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,16)));
        cs.addSkipDay(new Daily(LocalTime.of(10, 50, 0), LocalTime.of(11, 50, 0), LocalDate.of(2017,4,17)));
        for(LocalDate d = LocalDate.of(2017, 1, 18); d.isBefore(LocalDate.of(2017, 5, 10));
            d = d.plusDays(1)) {
            if(cs.meetsOn(d)) {
                System.out.println(cs.getCopyForDay(d));
            }
        }


    }
}
