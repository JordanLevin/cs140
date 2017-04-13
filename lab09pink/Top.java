package lab09pink;

public class Top {
	private int[] arr;
	
	public Top(int[] a){
		arr = a;
	}
	public double average(){
		if(arr == null)
			return 0.0;
		if(arr.length == 0)
			return 0.0;
		double sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum/arr.length;
	}
	public int max(){
		if(arr == null)
			return Integer.MIN_VALUE;
		if(arr.length == 0)
			return Integer.MIN_VALUE;
		int max = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
