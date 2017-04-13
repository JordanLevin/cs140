package assignment10;

import java.util.ArrayList;

public class BinaryT<T> {
	private T data;
	private BinaryT<T> left;
	private BinaryT<T> right;

	public BinaryT(T dat, BinaryT<T> lft, BinaryT<T> rft) {
		data = dat;
		left = lft;
		right= rft;
	}
	

	public static void main(String[] args) {
		BinaryT<Integer> t7 = new BinaryT<>(7, null, null);
		BinaryT<Integer> t4 = new BinaryT<>(4, null, null);
		BinaryT<Integer> t0 = new BinaryT<>(0, null, null);
		BinaryT<Integer> t1 = new BinaryT<>(1, t7, null);
		BinaryT<Integer> t5 = new BinaryT<>(5, t4, t0);
		BinaryT<Integer> t3 = new BinaryT<>(3, t1, t5);
		System.out.println(t3.bftravers());
	}
	
	public ArrayList<T> bftravers(){
		ArrayList<BinaryT<T>> list= new ArrayList<BinaryT<T>>();
		list.add(this);
		return bftravers(list);
		
	}
	private ArrayList<T> bftravers(ArrayList<BinaryT<T>> nodeQueue){
		ArrayList<T> retval = new ArrayList<T>();
		if(nodeQueue.size()>0){
			retval.add(nodeQueue.get(0).data);
			BinaryT<T> temp = nodeQueue.get(0);
			nodeQueue.remove(0);
			if(temp.left != null)
				nodeQueue.add(temp.left);
			if(temp.right != null)
				nodeQueue.add(temp.right);
			retval.addAll(bftravers(nodeQueue));
		}
		return retval;
	}
}