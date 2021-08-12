/**
 * This is the Card class for part 1 of the final project
 * Build a card with a value and a suit
 * */
public class Card {
    /**
     * The card's instance variable
     * Should return the value from 1-13 and suit which are HEART, DIAMOND, CLUB, SPADE
     */
    private int value;
    private char suit;

    /**
     * This default constructor will create the card's object
     * Return the card with a value and a suit by the toString() method
     */
    public Card(){
    }

    /**
     * This constructor specifies the card
     * Should create an object with specified values
     * @param value input new value for the card
     * @param suit input new suit of the card
     * Return a new card with new value and suit
     */
    public Card(int value, char suit){
        this.value = value;
        this.suit = suit;
    }

    /**
     * A method to set the value and suit for the card
     * @param value input new value
     * @param suit input new suit
     * Change the card
     */
    public void setAll(int value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     * Get the card's value after setting
     * and convert it to string with corresponding values
     * @return the card's value which is already converted
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
                } else
                    return "Error!";
    }

    /**
     * Get the card's suit after setting
     * Should be HEART, DIAMOND, CLUB or SPADE
     * @return the card's suit
     */
    public char getSuit(){

        return suit;
    }

    /**
     * Print out the card after being called by the object
     * Should return 0 and null if there is no default constructor
     * @return Return the card with a value and suit together
     */
    public String toString(){

        return getValue() + " " + suit;
    }

    /**
     * This method will draw a card
     * Should receive a value and symbols after setting and converting
     * Return a card with the frame, the value and the suit
     */
    public void drawCard(){
        System.out.println("-------");
        System.out.println("|"+ suit + "   "+ suit + "|");
        if(value==10){
            System.out.println("| " + getValue() + "  |");
        } else {
            System.out.println("|  " + getValue() + "  |");
        }
        System.out.println("|"+ suit + "   "+ suit + "|");
        System.out.println("-------");
    }
}
