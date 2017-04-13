package assignment09;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	
	public static ArrayList<Integer> selection(ArrayList<Integer> list){
		if(list == null)
			return null;
		if(list.size() == 0)
			return new ArrayList<Integer>();
		int min = Collections.min(list);
		list.remove((Integer)min);
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(min);
		list2.addAll(selection(list));
		return list2;
	}
	
	public static boolean inOrder(ArrayList<Integer> list){
		if(list==null)
			return true;
		if(list.size() == 0)
			return true;
		for(int i = 0;i<list.size()-1;i++){
			if(list.get(i)>list.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	private static ArrayList<Integer> less(ArrayList<Integer> list){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: list){
			if(i<list.get(0))
				ret.add(i);
		}
		return ret;
	}
	private static ArrayList<Integer> geq(ArrayList<Integer> list){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 1;i<list.size();i++){
			if(list.get(i)>=list.get(0))
				ret.add(list.get(i));
		}
		return ret;
	}

	public static ArrayList<Integer> qsort(ArrayList<Integer> list){
		if(list == null)
			return null;
		if(list.size() == 0)
			return new ArrayList<Integer>();
		if(inOrder(list)){
			ArrayList<Integer> ret = new ArrayList<Integer>(list);
			return ret;
		}
		int pivot = list.get(0);
		//System.out.println(list + " " + less(list) + " " + geq(list));
		ArrayList<Integer> ret = qsort(less(list));
		//System.out.println(ret);
		ret.add(pivot);
		ret.addAll(qsort(geq(list)));
		
		return ret;
	}
}
