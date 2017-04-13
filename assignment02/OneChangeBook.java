package assignment02;

public class OneChangeBook{
    private Book[] array;

    public OneChangeBook(Book[] array){
        this.array = array;

    }

    public int smallestAfter(int start){
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for(int i =start;i<array.length;i++){
            if(array[i].getNumPages()<smallest){
                smallest = array[i].getNumPages();
                index = i;
            }
        }
        return index;
    }

    public Book[] modify(int start){
        Book[] temp = new Book[array.length];
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
