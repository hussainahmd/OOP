// Fig. 7.13: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest {

   // execute application
   public static void main(String[] args) {

      DeckOfCards myDeckOfCards = new DeckOfCards();

      long startTime = System.currentTimeMillis();
      myDeckOfCards.checking();
      long endTime = System.currentTimeMillis();

      long elapasedTime = endTime - startTime;

      int location = myDeckOfCards.getLocation();
      int counter = myDeckOfCards.getCounter();

		System.out.printf("%nSequence found at index %d" , location);
      System.out.printf(" after %d shuffles%n%n" , counter);
      
		for( int k=location ; k < location+5 ; k++ ){
			System.out.printf("%-19s", myDeckOfCards.sequenceCard() );
		}

      System.out.printf("%n%nIt took %d mili seconds to find it%n" , elapasedTime );

      // print all 52 Cards in the order in which they are dealt
      for (int i = 0; i < 52; i++) {

         if (i % 4 == 0) { // output a newline after every fourth card
            System.out.println();
         } 
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());
      }

      System.out.println("");
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
