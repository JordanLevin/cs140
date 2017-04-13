package assignment03;

import java.util.Arrays;

public class Test2{
    public static void main(String[] args){
        double val = 5.286;

        double[] first = {};
        double[] second = {3772, 4827.765, 248.2, 765.8};
        double[] third = {5.287, 5.285, 23728.876, 5.286};
        double[] fourth = null;
        
        int v = 5;
        int[] first2 = {2,4,7,8,9,18,374,2362};
        int[] second2 = {2,4,5,8,9,18,374,2362};
        int[] third2 = {1,2,3,4};
        int[] fourth2 = {6,7,15,197};

        System.out.println("Testing indexOf");

        System.out.println(Assig3.indexOf(val, first));
        System.out.println(Assig3.indexOf(val, second));
        System.out.println(Assig3.indexOf(val, third));
        System.out.println(Assig3.indexOf(val, fourth));



        System.out.println("Testing indexOf2");


        System.out.println(Assig3.indexOf2(val, first));
        System.out.println(Assig3.indexOf2(val, second));
        System.out.println(Assig3.indexOf2(val, third));
        System.out.println(Assig3.indexOf2(val, fourth));


        System.out.println("Testing indexOf3");
        
        
        System.out.println(Assig3.indexOf3(v, first2));
        System.out.println(Assig3.indexOf3(v, second2));
        System.out.println(Assig3.indexOf3(v, third2));
        System.out.println(Assig3.indexOf3(v, fourth2));

        
        System.out.println("Testing insertIfNeeded");
        
        System.out.println(Arrays.toString(Assig3.insertIfNeeded(v, first2)));
        System.out.println(Arrays.toString(Assig3.insertIfNeeded(v, second2)));
        System.out.println(Arrays.toString(Assig3.insertIfNeeded(v, third2)));
        System.out.println(Arrays.toString(Assig3.insertIfNeeded(v, fourth2)));
    
    
    }
}
