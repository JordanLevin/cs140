package lab09pink;

public class Lower extends Top{
	private int[] arr1;
	
	public Lower(int[] a, int[] b) {
		super(a);
		arr1 = b;
	}
	
	public double average(){
		return new Top(arr1).average();
	}
	public int max(){
		return Math.max(super.max(), new Top(arr1).max());
	}

}
