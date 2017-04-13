package assignment02;

public class OneChange{
    private int [] array;

    public OneChange(int[] array){
        this.array = array;

    }

    public int smallestAfter(int start){
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for(int i =start;i<array.length;i++){
            if(array[i]<smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public int[] modify(int start){
        int[] temp = new int[array.length];
        int k = smallestAfter(start);
        //System.out.println(k);
        for(int i = 0;i<start;i++){
            temp[i] = array[i];
        }
        temp[start] = array[k];
        for(int j = start;j<k;j++){
            temp[j+1] = array[j];
        }
        for(int a = k+1;a<array.length;a++){
            temp[a] = array[a];
        }
        return temp;
    }
}
