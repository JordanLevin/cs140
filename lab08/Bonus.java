package lab08;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level = 5;
		for(int i = 0;i<=level;i++){
			for(int j = 0;j<=i;j++){
				System.out.print(Recursion.binomialCoefficient(i, j)+ " ");
			}
			System.out.println();
		}
	}

}
