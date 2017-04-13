package lab09pink;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabTester {
	
    public int[] test1 = null;
    public int[] test2 = {};
    public int[] test3 = {5, 2, -2, 7, -5, 2};
    public int[] test4 = {5, 10, 15};
	
	
	@Test
	public void firstTest() {
		Question1 one = new Question1(0);
		assertEquals(one.toString(), "0 = 0");
	}
	@Test
	public void secondTest() {
		Question1 two = new Question1(1);
		assertEquals(two.toString(), "1 = 1");
	}
	@Test
	public void thirdTest() {
		Question1 three = new Question1(31);
		assertEquals(three.toString(), "31 = 31");
	}
	@Test
	public void fourthTest() {
		Question1 four = new Question1(2310);
		assertEquals(four.toString(), "2310 = 2 x 3 x 5 x 7 x 11");
	}
	@Test
	public void avg1(){
		assertEquals(new Top(test1).average(), 0, .00001);
	}
	@Test
	public void avg2(){
		assertEquals(new Top(test2).average(), 0, .00001);
	}
	@Test
	public void avg3(){
		assertEquals(new Top(test3).average(), 1.5, .00001);
	}
	@Test
	public void avg4(){
		assertEquals(new Lower(test1, test2).average(), 0, .00001);
	}
	@Test
	public void avg5(){
		assertEquals(new Lower(test1, test3).average(), 1.5, .00001);
	}
	@Test
	public void avg6(){
		assertEquals(new Lower(test2, test3).average(), 1.5, .00001);
	}
	@Test
	public void avg7(){
		assertEquals(new Lower(test3, test1).average(), 0, .00001);
	}
	@Test
	public void avg8(){
		assertEquals(new Lower(test3, test2).average(), 0, .00001);
	}
	@Test
	public void avg9(){
		assertEquals(new Lower(test2, test1).average(), 0, .00001);
	}
	@Test
	public void max1(){
		assertEquals(new Top(test1).max(), Integer.MIN_VALUE, .00001);
	}
	@Test
	public void max2(){
		assertEquals(new Top(test2).max(), Integer.MIN_VALUE, .00001);
	}
	@Test
	public void max3(){
		assertEquals(new Top(test3).max(), 7, .00001);
	}
	@Test
	public void max4(){
		assertEquals(new Lower(test1, test2).max(), Integer.MIN_VALUE);
	}
	@Test
	public void max5(){
		assertEquals(new Lower(test1, test3).max(), 7);
	}
	@Test
	public void max6(){
		assertEquals(new Lower(test2, test3).max(), 7);
	}
	@Test
	public void max7(){
		assertEquals(new Lower(test3, test1).max(), 7);
	}
	@Test
	public void max8(){
		assertEquals(new Lower(test3, test2).max(), 7);
	}
	@Test
	public void max9(){
		assertEquals(new Lower(test2, test1).max(), Integer.MIN_VALUE);
	}
	
	
	//extra test cases in case it is needed
	@Test
	public void max10(){
		assertEquals(new Lower(test3, test4).max(), 15);
	}
	@Test
	public void avg11(){
		assertEquals(new Lower(test3, test4).average(), 10, 0.00001);
	}
	
	

}
