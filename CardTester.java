/** DO NOT CHANGE FILE!! only changes allowed would be to comment/uncomment code for debugging, and if you do STEP 3 (BONUS ROUND) **/

public class CardTester
{
	/**
     * TESTER ALGORITHM (FULL TEST):
     * -	test all valid combinations
     * 		-	output all 13 heart cards
     * 		-	output all 13 diamond cards
     * 		-	output all 13 club cards
     * 		-	output all 13 spade cards
     * -	test invalid suit/values (next week! no tests for now)
     */
	public static void main(String[] args)
	{
		//TESTS FOR setAll() + getValue() METHOD (to get basics down before FULL TEST)
		Card heartAce, diamondJack, clubQueen, spadeKing;

		heartAce = new Card();
		diamondJack = new Card();
		clubQueen = new Card();
		spadeKing = new Card();

		heartAce.setAll(1, (char)3);
		diamondJack.setAll(11, (char)4);
		clubQueen.setAll(12, (char)5);
		spadeKing.setAll(13, (char)6);

		System.out.println("Heart Ace card should have A value (not 1!):\t " + heartAce.getValue());
		System.out.println("Diamond Jack card should have J value (not 11!): " + diamondJack.getValue());
		System.out.println("Club Queen card should have Q value (not 12!):\t " + clubQueen.getValue());
		System.out.println("Spade King card should have K value (not 13!):\t " + spadeKing.getValue());

		//TESTS FOR toString() METHOD (to get basics down before FULL TEST) (uncomment when ready!)

		System.out.println("Heart Ace card should show A " + (char)3 + ":\t\t" + heartAce.toString());
		System.out.println("Diamond Jack card should show J " + (char)4 + ":\t" + diamondJack); //if created toString() correctly, Java calls it for you!
		System.out.println("Club Queen card should show Q " + (char)5 + ":\t" + clubQueen);
		System.out.println("Spade King card should show K " + (char)6 + ":\t" + spadeKing);


		// FULL TEST (uncomment when ready!)

		Card[] deck;
		char currentSuit;
		int currentValue;
		
		deck = new Card[52];
		currentSuit = 3; //heart == 3, diamond == 4, clubs == 5, spade = 6 
		//currentSuit = '\u2660';//mac
		
		//generate cards in deck
		for(int i = 0; i < deck.length; i++)
		{
			//guarantees a value between 1 and 13
			currentValue = i % 13 + 1;

			//create card and add to array
			deck[i] = new Card();
			deck[i].setAll(currentValue, currentSuit);
			
			//change suit every 13 cards (heart to diamond to clubs to spade)
			if( (i+1)%13 == 0 )
			{
				currentSuit++;
			}
		}
		
		//print out cards in deck
		for(int i = 0; i < deck.length; i++)
		{
			System.out.print(deck[i] + "   ");
			
			//separate every 13 lines (Avoid linewrapping in console)
			if( (i+1)%13 == 0)
			{
				System.out.println();
			}
		}
		// DrawCard tester
		Card heart, diamond, club, spade;
		heart = new Card();
		diamond = new Card();
		club = new Card();
		spade = new Card();
		heart.setAll(1, (char)3);
		diamond.setAll(5, (char)4);
		club.setAll(13, (char)5);
		spade.setAll(10, (char)6);
		heart.drawCard();
		diamond.drawCard();
		club.drawCard();
		spade.drawCard();

	}
}

