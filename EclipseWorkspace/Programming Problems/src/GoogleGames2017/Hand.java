package GoogleGames2017;

import java.util.Arrays;

public class Hand {
	public Card[] cards;

	public Hand(Card[] cards) {
		super();
		this.cards = cards;
	}
	
	public boolean isFullHouse(){
		
	}
	
	public boolean equals(Hand h){
		if(Arrays.equals(Arrays.sort(this.cards), Arrays.sort(h.cards)));
	}
	
	

}
