
package assignment09;


import java.util.ArrayList;

public class SortTester {
    public static void main(String[] args){
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(6);
		t.add(3);
		t.add(10);
		t.add(2);
		t.add(7);
		
		System.out.println(Sorting.qsort(t));
	
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		sorted.add(2);
		sorted.add(3);
		sorted.add(6);
		sorted.add(7);
		sorted.add(10);
		
		System.out.println(Sorting.qsort(sorted));
    }
}
