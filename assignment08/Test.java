package assignment08;

import static org.junit.Assert.*;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	@org.junit.Test
	public void testArea1() {
		Rectangle r = new Rectangle(6,10);
		assertEquals(r.getArea(), 60);
	}
	@org.junit.Test
	public void testArea2() {
		Rectangle r = new Rectangle(0,5);
		assertEquals(r.getArea(), 0);
	}

	@org.junit.Test
	public void testArea3() {
		Rectangle r = new Rectangle(5,0);
		assertEquals(r.getArea(), 0);
	}
	//pretty sure factors works, not 100% though
	@org.junit.Test
	public void testFactor() {
		assertEquals(Factorize.factors(0).size(), 0);
		assertEquals(Factorize.factors(1).size(), 0);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(7);
		assertEquals(Factorize.factors(70), arr);
		assertEquals((int)Factorize.factors(71).get(0), 71);
	}
	@org.junit.Test
	public void testBinary() {
		assertEquals(Factorize.binary(38), "100110");
		assertEquals(Factorize.binary(39), "100111");
	}
	@org.junit.Test
	public void testReverse() {
		assertEquals(Factorize.reverse(null), "llun");
		assertEquals(Factorize.reverse(""), "");
		assertEquals(Factorize.reverse("abcdefghijklmnopqrst"), "tsrqponmlkjihgfedcba");
	}
	@org.junit.Test
	public void testIndexOf(){
		assertEquals(Factorize.indexOf("jifuhgruerifjhg", "test"), -1);
		assertEquals(Factorize.indexOf("jifuhgruertest1test1ifjhg", "test1"), 10);
	}
	@org.junit.Test
	public void testPtsArea(){
		Point2D.Double[] pts = 
			{new Point2D.Double(1,3), new Point2D.Double(2,2),
			new Point2D.Double(2,1), new Point2D.Double(1,0),
			new Point2D.Double(0,1), new Point2D.Double(0,2)};
		assertEquals(Factorize.area(pts), 4.0, .000001);
	}

}
