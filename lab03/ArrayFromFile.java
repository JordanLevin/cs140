package lab03;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFromFile{
    private int[] array;
    
    public ArrayFromFile(String filename){
        try(Scanner scan = new Scanner(new File(filename))){
            int l = scan.nextInt();
            array = new int[l];
            for(int i = 0;i<l;i++){
                array[i] = scan.nextInt();
            }
        } catch (Exception e){
            array = new int[0];
        }
    }
    public int[] getArray(){
        return array;
    }
    public String toString(){
        return Arrays.toString(array);
    }
    public void removeOddElements(){
        int evenCount = 0;
        for(int i :array){
            if(i%2==0)
                evenCount++;
        }
        int[] temp = new int[evenCount];
        int index = 0;
        for(int i : array){
            if(i%2==0){
                temp[index] = i;
                index++;
            }
        }
        this.array = temp;
    }
}
