package assignment02;

public class WeirdSorterBook{
    private Book[] array;

    public WeirdSorterBook(Book[] array){
        this.array = array;
    }
    
    public Book[] sorted(){
        for(int i =0;i<array.length;i++){
            OneChangeBook o = new OneChangeBook(array);
            array = o.modify(i);

        }



        return array;
    }

}
