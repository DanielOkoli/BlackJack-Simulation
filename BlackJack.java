package uk.co.daniel.okoli.novus.collections;

public class BlackJack {
	/**
	 * One of the four valid suits for this card,
	*/
	private Suit mySuit;
	
	/**
	 * The number of his card, where Ace 1, Jack-King : 11-13
	*/
	
	private int myNumbers;
	
	/**
	 * Card Constructor
	 * aSuit
	 * aNumber
	 */
	    
	public BlackJack(Suit aSuit, int aNumber) {
		
		this.mySuit = aSuit;
		this.myNumbers = aNumber;
		
		if (aNumber>= 1 && aNumber <= 13) {
			this.myNumbers = aNumber;
		}else {
			System.err.println(aNumber + "is not a valid Card number");
		    System.exit(1);
	 }
	}
	/**
	 *Return the number of the Card.
	 * 
	 * @return the number
	 */
	
	public int getNumbers() {
	    return myNumbers;
   }

	public String toString() {
		
		String numStr = "Error";
		
		switch(this.myNumbers) {
		
		case 2:
			numStr = "Two";
			break;
			
		case 3:
			numStr = "Three";
		
		case 4:
			numStr = "Four";
		    break;
		    
		case 5:
			numStr = "Five";
			break;
			
		case 6:
			numStr = "Six";
			break;
			
		case 7:
			numStr = "Seven";
			break;
			
		case 8:
			numStr = "Eight";
			break;
			
		case 9:	
		    numStr = "Nine";
		    break;
		    
		case 10:
			numStr = "Ten";
			break;
			
		case 11:
			numStr = "Jack";
			break;
			
		case 12:
		    numStr = "Queen";
		    break;
		    
		case 13:
			numStr = "King";
		    break;
		    
		case 1:
			numStr = "Ace";
			break;
		
		}
		
		return numStr + " of " + mySuit.toString();
	
	}
	
}


