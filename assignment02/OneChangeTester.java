

package assignment02;

import java.util.Arrays;
public class OneChangeTester{


    public static void main(String[] args){
        int[] test = {3,7,9,10,2,6,3,1,2};
        OneChange one = new OneChange(test);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(one.modify(4)));


        /*int[] test = {3,7,9,10,2,6,3,1,2};
        WeirdSorter1 ws = new WeirdSorter1(test);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(ws.sorted()));*/

        /*Book[] test1 = {
        new Book("Book A", 3), 
        new Book("Book B", 7),
        new Book("Book C", 9),
        new Book("Book D", 10),
        new Book("Book E", 2),
        new Book("Book F", 6),
        new Book("Book G", 3),
        new Book("Book H", 1)
        };
        WeirdSorterBook ws2 = new WeirdSorterBook(test1);
        System.out.println(Arrays.toString(ws2.sorted()));*/




    }

    public static double avgPagesInLibrary(Book[] books){
        double total = 0;
        for(int i =0;i<books.length;i++){
            total+= books[i].getNumPages();
        }
        return total/(double)books.length;

    }
}
