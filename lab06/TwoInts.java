package lab06;

public class TwoInts extends OneInt{
	private int two;
	public TwoInts(int a, int b){
		super(a);
		two = b;
	}
	@Override
	public int sum(){
		return super.sum() + two;
	}
	@Override
	public String toString(){
		return "(" + super.toString() + "," + two + ")";
	}
}
