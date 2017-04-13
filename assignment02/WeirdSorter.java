package assignment02;

public class WeirdSorter{
    private int[] array;

    public WeirdSorter(int[] array){
        this.array = array;
    }
    
    public int[] sorted(){
        for(int i =0;i<array.length;i++){
            OneChange o = new OneChange(array);
            array = o.modify(i);

        }



        return array;
    }

}
