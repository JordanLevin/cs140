package assignment04;

//import Space;
import java.util.*;

public class House{
    ArrayList<Space> spaces;

    public House(){
        spaces = new ArrayList<Space>();
    }
    /**
    * Adds a new space to the house.
    * @param sp The space to be added to the House.
    * @throws IllegalArgumentException if sp is null
    **/
    public void add(Space sp){
        if(sp==null)
            throw new IllegalArgumentException("Rooms cannot be null");
        spaces.add(sp);
    }
    /**
    * Calculates the area of all Spaces in the house combined
    * @return The sum of the areas of all Spaces in the house
    **/
    public double totalArea(){
      double sum = 0;
      for(int i = 0;i<spaces.size();i++)
        sum+=spaces.get(i).getArea();
      return sum;
    }
    /**
    * makes a string out of the spaces ArrayList
    * @return spaces.toString()
    **/
    public String toString(){
      return spaces.toString();
    }


}
