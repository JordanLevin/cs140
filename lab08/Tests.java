package lab08;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Tests {

	@Test
	public void testFactorialSimple() {
	    assertEquals(120, Recursion.factorial(5));
	    assertEquals(1, Recursion.factorial(1));
	    assertEquals(1, Recursion.factorial(0));
	}
	@Test
	public void testSquareRoot(){
		assertEquals(1, Recursion.squareRoot(1), 1e-6);
		assertEquals(4, Recursion.squareRoot(16), 1e-6);
	}
	@Test
	public void testListSum(){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(2);
		assertEquals(15, Recursion.sum(l));
		
	}
	@Test
	public void testArraySum(){
		int[] arr = {5, 8, 2};
		assertEquals(15, Recursion.sum(arr));
	}
	@Test
	public void testBinomialCoefficient(){
		assertEquals(3003, Recursion.binomialCoefficient(15, 5));
		assertEquals(5005, Recursion.binomialCoefficient(15, 9));
	}

}
