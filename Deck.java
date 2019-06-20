package uk.co.daniel.okoli.novus.collections;
import java.util.Random;
/**
 * An implementation of a deck of cards
 * 
 * @author daniel
 *
 */
public class Deck {
	/**
	 * The array of cards in the deck, where the top card is the first index.
	 */
private BlackJack[] myCards;

	/**
	 * Array.List<Card> myCards
	 * LinkedList<Card>myCards
	 * The number of cards currently in the deck.
	 */
private int numCards;
/**
 * Constructor with a default of one deck (i.e.. 52 cards) and no shuffling 
 */

public 	Deck() {
	
	//call the other constructor defining one deck without shuffling
	this(1,false);

}
	/**
	 * Constructor that defines the number of decks (i.e., how many sets of 52)
	 * cards are in the deck) and whether it should be shuffled.
	 * 
	 * @param numDeck the number of individual decks in this deck
	 * @param shuffle whether to shuffle the cards
	 */
public Deck (int numDeck, boolean shuffle) {
	
     this.numCards = numDeck * 52;
     this.myCards = new BlackJack[this.numCards];
 
     //unit card index
     int c = 0;
     
     //for each deck
     for (int d = 0; d < numDeck; d++) {
    	 //for each suit
    	 for (int s = 0; s <4; s++) {
    		 //for each number
    		 for (int n = 1; n <= 13; n++) {
    			 //add a new card to the deck
    			 this.myCards[c] = new BlackJack(Suit.values()[s], n);
    			 c++;
    		 }
    	 }
     }
    			 
    // shuffle, if necessary
    if (shuffle) 
    	this.shuffle();
    		 
    		 
   }
/**
 * shuffle deck by randomly swapping pairs of cards.
 */
 public void shuffle() {
	 
     //init random number generator
	 Random rng = new Random();
	 
	 //temporary card
	 BlackJack temp;
	 
	 int j;
	 for (int i = 0; i < this.numCards; i++) {
		 
		 //get a random card to swap i's value with 
		 j  = rng.nextInt(this.numCards);
	     
	     // do swap
	     temp = this.myCards[i];
	     this.myCards[i] = this.myCards[j];
	     this.myCards[j] = temp;
	     
	 }
   }

 /**
  * Deal the next card from the top of the deck.
  * 
  * @return the dealt card
  */
  public BlackJack dealNextCard() {
	
	  //get the top card
	  BlackJack top = this.myCards[0];
	  
	  //shifts all the subsequent cards to the left by one index
	  for (int c = 1; c < this.numCards; c++) {
		  this.myCards[c-1] = this.myCards[c];
	  }
	  this.myCards[this.numCards -1] = null;
	  
	  //decrement the number of cards in our deck
	  this.numCards--;
	  
	  return top;
  }
  
  /**
   * Print the top cards in the deck.
   * 
   * @param numtoPrint the number of cards from the top of the deck to print
   *                   print
   */        
  
  public void printDeck(int numtoPrint) {
    
	  for (int c = 0; c < numtoPrint; c++) {
		  System.out.printf("% 3d/%d %s\n", c+1, this.numCards,
				  this.myCards[c].toString());
	  }
	  System.out.printf("\t[%d other]\n", this.numCards - numtoPrint);  
		  
  
  
   }
}



