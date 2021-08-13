/** This is the Card class for part-2 of the project
 * This Card class builds the Card's values and its suits.
 * @author group 1
 */
public class Card {
    //updated instances variables from part-1
    public static final char HEART = (char)3;
    public static final char DIAMOND = (char)4;
    public static final char CLUB = (char)5;
    public static final char SPADE = (char)6;
    public static final int DEFAULT_VALUE = 1;
    public static final char DEFAULT_SUIT = (char)3;
    private char suit;
    private int value;

    /**
     * No-arg constructor, initialize the card with the default value and suit
     * return a new ACE HEART
     */
    public Card() {
        this.value = DEFAULT_VALUE;
        this.suit = DEFAULT_SUIT;
    }

    /**
     * Full constructor of the Card class.
     * It will shut down the program if the value or suit are invalid.
     *
     * @param value an integer in the interval [1,13]
     * @param suit one of HEART, DIAMOND, CLUB, SPADE
     */
    public Card(int value, char suit) {
        if (!isValidValue(value) || !isValidSuit(suit)) {
            System.exit(0);
        }
        this.value = value;
        this.suit = suit;
    }

    /**
     * Sets a new value for the card.
     * The card's value will be set to the new value if it is valid.
     *
     * @param value an integer in the interval [1,13]
     * @return true if the value was set, otherwise false
     */
    public boolean setValue(int value) {
        if (isValidValue(value)) {
            this.value = value;
            return true;
        }
        return false;
    }

    /**
     * Sets the card's suit.
     * The card's suit will be set to the new suit if it is valid.
     *
     * @param suit one of HEART, DIAMOND, CLUB, SPADE
     * @return true if the suit was set, otherwise false
     */
    public boolean setSuit(char suit) {
        if (isValidSuit(suit)) {
            this.suit = suit;
            return true;
        }
        return false;
    }

    /**
     * Sets value and suit for the card.
     * The card's value and suit will be set to the new value and suit if they
     * are both valid.
     *
     * @param value an integer in the interval [1,13]
     * @param suit one of HEART, DIAMOND, CLUB, SPADE
     * @return true if the value and suit were set, otherwise false
     */
    public boolean setAll(int value, char suit) {
        if (isValidValue(value) && isValidSuit(suit)) {
            this.suit = suit;
            this.value = value;
            return true;
        }
        return false;
    }

    /**
     * Gets the card's value as a string.
     * Face cards will be converted to "A" for 1, "J" for 11, "Q" for 12
     * queen and "K" for 13. All other values will be converted to
     * strings as-is.
     *
     * @return the card's value in form of string
     */
    public String getValue() {
        if (value > 1 & value < 11) {
            return Integer.toString(value);
        } else if (value == 1) {
            return "A";
        } else if (value == 11){
            return "J";
        } else if(value == 12) {
            return "Q";
        } else if (value == 13){
            return "K";
        } else {
            return "" +this.value;
        }
    }

    /**
     * Gets the card's suit.
     *
     * @return the card's suit in form of ASCII symbols
     */
    public char getSuit() {
        return suit;
    }

    /**
     * Gets the card as a string.
     *
     * @return a string including the card's value and suit
     */
    public String toString() {
        return this.getValue() + " " + this.suit;
    }

    /**
     * Tests if another card is equal to this card.
     * Two cards are considered equal if they have the same value and suit.
     *
     * @param otherCard the card to compare to.
     * @return true if the cards are equal, otherwise false
     */
    public boolean equals(Card otherCard) {
        return (value == otherCard.value) && (suit == otherCard.suit);
    }

    /**
     * Checks the input value if it is valid or not
     *
     * @return true if it is in the range, otherwise false
     */
    private boolean isValidValue(int value) {
        return value >= 1 && value <= 13;
    }

    /**
     * Checks the suit value if it is value or not
     *
     * @return true if it is valid, otherwise false
     */
    private boolean isValidSuit(char suit) {
        switch (suit){
            case CLUB:
            case DIAMOND:
            case HEART:
            case SPADE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Draws a card with a value and a suit.
     * The card is printed to the console.
     * Used in part-1
     */
    public void drawCard() {
        System.out.println("-------");
        System.out.println("|" + suit + "   " + suit + "|");
        if(value==10){
            System.out.println("| " + getValue() + "  |");
        } else {
            System.out.println("|  " + getValue() + "  |");
        }
        System.out.println("|" + suit + "   " + suit + "|");
        System.out.println("-------");
    }
}
