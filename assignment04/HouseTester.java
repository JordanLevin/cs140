package assignment04;

import java.util.*;

public class HouseTester{
  public static void main(String[] args){
    Space space1 = new Space("space1", 10.0);
    Space space2 = new Space("space2", 20.0);
    Space space3 = new Space("space3", 40.0);

    House house1 = new House();
    House house2 = new House();
    House house3 = new House();
    house1.add(space1);
    house2.add(space1);
    house2.add(space2);
    house3.add(space3);

    ArrayList<House> houseList = new ArrayList<House>();
    houseList.add(house1);
    houseList.add(house2);
    houseList.add(house3);
    house1.ad
    System.out.println(biggestFloorSpace(houseList));


  }

public static House biggestFloorSpace(ArrayList<House> houses){
  House biggest = new House();
  for(int i =0;i<houses.size();i++){
    if(houses.get(i)!=null){
      if(houses.get(i).totalArea()>biggest.totalArea()){
        biggest = houses.get(i);
      }
    }
  }
  return biggest;
}


}
