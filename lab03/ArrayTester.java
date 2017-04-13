package lab03;

import java.util.Arrays;

public class ArrayTester{

    public static void main(String[] args){
        if(args!=null && args.length==1){
            ArrayFromFile test = new ArrayFromFile(args[0]);
            System.out.println("[20, 8, 13, 46, 7]");
            System.out.println("");
            System.out.println(test);

            test.removeOddElements();
            System.out.println("[20, 8, 46]");
            System.out.println("");
            System.out.println(test);

        }
        else
            throw new IllegalArgumentException("too many or too few arguments");
        
        int[] array = new int[5];
        System.out.println(Arrays.toString(array));
        
        int n = 0;
        for (int i : array) {
                i = n;
                n++; // shorthand to increment by 1
        }

        String[] strArray = new String[4];
        strArray[0] = "string 1";
        strArray[1] = "string 2";
        strArray[2] = "string 3";
        strArray[3] = "string 4";
        for(String i:strArray){
            System.out.println(i + " " +i.length());
        }

    
    }
}
