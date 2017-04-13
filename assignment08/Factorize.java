package assignment08;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public class Factorize {
	public static ArrayList<Integer> factors(int n){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(n<0)
			throw new IllegalArgumentException("number cant be negative");
		if(n==0||n==1)
			return temp;
		if(n==2){
			temp.add(n);
			return temp;
		}
		int f = 2;
		while(true){
			if(n%f==0){
				temp.add(f);
				break;
			}
			f++;
		}
		temp.addAll(factors(n/f));
		return temp;
	}
	public static String binary(int n){
		if(n<0)
			throw new IllegalArgumentException("number cant be negative");
		if(n==1 || n==0)
			return Integer.toString(n);
		if(n%2==0)
			return binary(n/2) + '0';
		else
			return binary(n/2) + '1';
	}
	public static String reverse(String text){
		if(text==null)
			return "llun";
		if(text.length()==1 || text.length()==0)
			return text;
		return reverse(text.substring(1, text.length())) + text.charAt(0);
	}
	public static int indexOf(String text, String str){
		//using 0 instead of 1 produces string index out of bounds, why
		//using 1 makes the index 1 too high but fixes the other issue
		return indexOf(0, text, str);
	}
	public static int indexOf(int count, String text, String str){
		if(text.startsWith(str))
			return count;
		if(text.length()==0) // not sure about this line
			return -1;
		return indexOf(count+1, text.substring(1, text.length()), str);
	}
	
	public static double area(Point2D.Double[] pts){
		if(pts.length==3){
			return Math.abs(pts[0].getX()*pts[1].getY()
					+pts[1].getX()*pts[pts.length-1].getY()
					+pts[pts.length-1].getX()*pts[0].getY()
					-pts[1].getX()*pts[0].getY()
					-pts[pts.length-1].getX()*pts[1].getY()
					-pts[0].getX()*pts[pts.length-1].getY())/2;
		}
		return Math.abs(pts[0].getX()*pts[1].getY()
				+pts[1].getX()*pts[pts.length-1].getY()
				+pts[pts.length-1].getX()*pts[0].getY()
				-pts[1].getX()*pts[0].getY()
				-pts[pts.length-1].getX()*pts[1].getY()
				-pts[0].getX()*pts[pts.length-1].getY())/2
				+area(Arrays.copyOfRange(pts, 1, pts.length));
	}
}
