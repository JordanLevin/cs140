package lab09pink;

import java.util.ArrayList;

public class Question1 {
	private int n;
	
	public Question1(int n1){
		n = Math.abs(n1);
	}
	public int smallestAboveTwo(){
		if(n == 0 || n ==1)
			return n;
		for(int i = 2;i<n;i++){
			if(n%i == 0)
				return i;
		}
		return n;
	}
	public ArrayList<Integer> factorize(){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		int temp = n;
		while(n>1){
			ret.add(smallestAboveTwo());
			n/=smallestAboveTwo();
		}
		n = temp;
		return ret;
	}
	public String toString(){
		if(n != 0 && n != 1)
			return n + " = " + factorize().toString().replaceAll(",", " x").replaceAll("]", "").replaceAll("\\[", "");
		return n + " = " + n;
	}
}
