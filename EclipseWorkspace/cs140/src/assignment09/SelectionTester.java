package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class SelectionTester {

	@Test
	public void test() {
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(6);
		t.add(3);
		t.add(10);
		t.add(2);
		t.add(7);
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		sorted.add(2);
		sorted.add(3);
		sorted.add(6);
		sorted.add(7);
		sorted.add(10);
		
		assertEquals(Sorting.selection(t), sorted);
	}
	@Test
	public void test2() {		
		assertNull(Sorting.selection(null));
	}
	@Test
	public void test3() {		
		assertEquals(Sorting.selection(new ArrayList<Integer>()), new ArrayList<Integer>());
	}

}
