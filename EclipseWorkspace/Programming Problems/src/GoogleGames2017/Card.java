package GoogleGames2017;

public class Card implements Comparable {
	public int suit;
	public int value;
	//public boolean color;
	public Card(int suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
	}
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		if(suit*value < ((Card)other).suit*((Card)other).value){
			return -1;
		}
		else if(suit*value>((Card)other).suit*((Card)other).value){
			return 1;
		}
		return 0;
	}
	public boolean equals(Card other){
		if(this.compareTo(other)==0)
			return true;
		return false;
	}
	public int getColor(){
		return suit%2;
	}
	
	
}
