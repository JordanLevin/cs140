package assignment03;

public class Assig3{

    public static boolean hasNegative(double[] arr){
        if(arr==null)
            return false;
        for(double i : arr){
            if(i<0)
                return true;
        }
        return false;
    }

    public static int indexOf(double value, double[] arr){
        int retVal = 0;
        if(arr==null)
            retVal = -3;
        else if(arr.length==0)
            retVal = -2;
        else{
            for(int i = 0;i<arr.length && retVal==0;i++){
                if(Math.abs(value-arr[i]) < 1e-9)
                    retVal = i;
            }
        }

        if(retVal==0)
            retVal = -1;

        return retVal;

    }

    public static int indexOf2(double value, double[] arr){
        int retVal = 0;
        if(arr==null)
            return -3;
        if(arr.length==0)
            return -2;

        for(int i = 0;i<arr.length && retVal==0;i++){
            if(Math.abs(value-arr[i]) < 1e-9)
                return i;
        }
        return -1;
    }
    public static int indexOf3(int value, int[] arr){
        int retVal = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            //element is found in array
            if(arr[i]==value){
                retVal = i;
                break;
            }
            //element is passed (because the array is assumed to be sorted)
            else if(arr[i]>value){
                retVal = -i-1; // ??? should -1 be here
                break;
            }
        }
        //entire array is less than value
        if(retVal==Integer.MAX_VALUE)
            retVal = -arr.length-1;
        return retVal;
    }
    public static int[] insertIfNeeded(int value, int[] arr){
        int k = Assig3.indexOf3(value, arr);
        //System.out.println(k);
        if(k>=0)
            return arr;
        else{
            int[] arr1 = new int[arr.length+1];
            System.arraycopy(arr, 0, arr1, 0, -k-1);
            arr1[-k-1] = value;
            System.arraycopy(arr, -k-1, arr1, -k, arr.length+k+1);
            return arr1;
        }

    }



}
