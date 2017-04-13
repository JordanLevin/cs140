package lab06;

import java.util.ArrayList;

public class OneInt {
	private int one;
	public OneInt(int one){
		this.one = one;
	}
	public int sum(){
		return one;
	}
	public String toString(){
		return Integer.toString(one);
	}
	public static int sumAll(ArrayList<OneInt> list){
		int sum = 0;
		if(list==null)
			return -1;
		for(OneInt i: list){
			if(i!=null)
				sum+=i.sum();
		}
		return sum;
	}
	
}
