package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class QSortTester {

	@Test
	public void test() {
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(6);
		t.add(3);
		t.add(10);
		t.add(2);
		t.add(7);
		t.add(64);
		t.add(29);
		t.add(11);
		t.add(16);
		t.add(19);
		
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		sorted.add(2);
		sorted.add(3);
		sorted.add(6);
		sorted.add(7);
		sorted.add(10);
		sorted.add(11);
		sorted.add(16);
		sorted.add(19);
		sorted.add(29);
		sorted.add(64);
		
		assertEquals(Sorting.qsort(t), sorted);
	}
	@Test
	public void test2() {		
		assertNull(Sorting.qsort(null));
	}
	@Test
	public void test3() {		
		assertEquals(Sorting.qsort(new ArrayList<Integer>()), new ArrayList<Integer>());
	}
	
	@Test
	public void test4() {
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		sorted.add(2);
		sorted.add(3);
		sorted.add(6);
		sorted.add(7);
		sorted.add(10);
		
		assertEquals(Sorting.qsort(sorted), sorted);
	}

}
