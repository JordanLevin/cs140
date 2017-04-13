package assignment03;

import java.util.Arrays;

public class House{
    private int nextIndex;
    private Space[] spaces = new Space[3];

    public House(){
        nextIndex = 0;
    }

    public void add(Space sp){
        spaces[nextIndex] = sp;
        if(nextIndex==spaces.length){
            spaces = Arrays.copyOf(spaces, spaces.length*2);
        }
        nextIndex++;

    }

    public double totalArea(){
        double answer = 0;
        for(int i = 0;i<spaces.length;i++){
            if(spaces[i]!=null){
                answer+=spaces[i].getArea();
            }
        }
        return answer;
    }

    public String toString(){
        return Arrays.toString(spaces);
    }

}
