package assignment05;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by jordan on 2/20/17.
 */
public class ClassSchedule {
    private ArrayList<Weekly> classDays;
    private ArrayList<Daily> skipDays;
    public ClassSchedule(){
         classDays = new ArrayList<>();
         skipDays = new ArrayList<>();
    }
    public void addClassDay(Weekly w){
        classDays.add(w);
    }
    public void addSkipDay(Daily d){
        skipDays.add(d);
    }
    public boolean meetsOn(LocalDate aDate){

        for(Weekly w : classDays){
            if(skipDays.size()==0){
                if(w.meetsOn(aDate)){
                    return true;
                }
            }
            for(Daily d: skipDays) {
                if(d.meetsOn(aDate)){
                    return false;
                }

            }
            if (w.meetsOn(aDate)) {
                return true;
            }
        }
        return false;
    }

    public Weekly getCopyForDay(LocalDate aDate) {
        for (Weekly w : classDays) {
            if (w.meetsOn(aDate)) {
                return w.copy(aDate);
            }
        }
        return null;
    }
}
