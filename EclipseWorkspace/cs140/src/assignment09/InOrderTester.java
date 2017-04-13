package assignment09;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class InOrderTester {

	
	
	@Test
	public void testNull() {
		assertEquals(Sorting.inOrder(null), true);
	}
	@Test
	public void testEmpty() {
		ArrayList<Integer> t = new ArrayList<Integer>();
		assertEquals(Sorting.inOrder(t), true);
	}
	@Test
	public void testSorted() {
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(2);
		t.add(5);
		t.add(8);
		t.add(15);
		
		assertEquals(Sorting.inOrder(t), true);
	}
	@Test
	public void testNonSorted() {
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(2);
		t.add(8);
		t.add(5);
		t.add(15);
		
		assertEquals(Sorting.inOrder(t), false);
	}
	
}
