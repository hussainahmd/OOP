// Fig. 7.12: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.security.SecureRandom;

public class DeckOfCards {
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

   private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
   private int currentCard = 0; // index of next Card to be dealt (0-51)

   // constructor fills deck of Cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};    
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};      

      // populate deck with Card objects                   
      for (int count = 0; count < deck.length; count++) {  
         deck[count] =                                     
            new Card(faces[count % 13], suits[count / 13]);
      }                                                    
   } 

   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) {
         // select a random number between 0 and 51 
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];   
         deck[first] = deck[second];
         deck[second] = temp;  

		
      } 
   }
   
   //five cards of consecutive face values
   public void sequence(){
	   
	   String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		 
	   int count = 0;
	   int location = 0;
	   int found = 0;
	   
	   while(found == 0){
		   
		   shuffle();//shuffle everytime the sequence is not found
		   
		   for (int i = 0; i < deck.length - 5; i++){
			   
			  for (int j = 0; j < faces.length - 5; j++) {
				  
				  if(deck[i].getFace() == faces[j]){
					  
					  if(deck[i + 1].getFace() == faces[j + 1]){
						  
						  if(deck[i + 2].getFace() == faces[j + 2]){
							
							  if(deck[i + 3].getFace() == faces[j + 3]){
								
								  if(deck[i + 4].getFace() == faces[j + 4]){
									
									  found = 1;
									  break;
								  }
							  }
						  }
					  }
				  }
			  }
			  
			  if(found == 1){
				location = i;
				break;} 
		  }
		  count++;
		}
		System.out.printf("%nSequence found at location %d%n%n" , location + 1);
		
		for(int s = location ; s < location + 5 ; s++){
			System.out.printf("%-19s", deck[s]);
		}
		System.out.printf("%n%nThe above sequence was found after %d shuffles%n%n" , count);   
   }

   // deal one Card
   public Card dealCard() {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length) {
         return deck[currentCard++]; // return current Card in array
      } 
      else {
         return null; // return null to indicate that all Cards were dealt
      } 
   } 
   
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
