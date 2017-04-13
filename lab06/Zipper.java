package lab06;

public class Zipper {
	public static int[] zip(int[] arr1, int[] arr2){
		if(arr1 == null || arr2 == null || arr1.length!=arr2.length)
			throw new IllegalArgumentException("bad input");
		int[] arr = new int[arr1.length*2];
		int a = 0;
		int b = 0;
		for(int i = 0;i<arr.length;i++){
			if(i%2==0){
				arr[i] = arr1[a];
				a++;
			}
			if(i%2==1){
				arr[i] = arr2[b];
				b++;
			}
		}
		return arr;
	}
}
