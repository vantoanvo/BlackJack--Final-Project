/** This is the Card class for the part-2 */
public class Card {
    //updated instances variables
    public static final char HEART = (char)3;
    public static final char DIAMOND = (char)4;
    public static final char CLUB = (char)5;
    public static final char SPADE = (char)6;

    public static final int DEFAULT_VALUE = 1;
    public static final char DEFAULT_SUIT = (char)3;

    private char suit;
    private int value;
    //No-arg Constructor
    public Card(){
        this.value=DEFAULT_VALUE;
        this.suit = DEFAULT_SUIT;
    }
   //Full Constructor
   public Card(int value, char suit){
        this.value = value;
        this.suit = suit;
    }
    //setValue() method
    public boolean setValue(int value){
       this.value = value;
       this.suit = DEFAULT_SUIT;
       String abc =getValue();
       if(abc.equals("0") || abc.equals("14")){
           this.value = 13;
           return false;
        } else {
           return true;
        }
    }
    //setSuit method
    public boolean setSuit(char suit) {
        this.suit = suit;
        if(this.value==13 && (this.suit != 'H') && (this.suit != (char)7)){
            return true;
        }
        else{
            this.suit = HEART;
            return false;
        }
    }
    //setAll() method
    public boolean setAll(int x, char abc) {
        this.value = x;
        this.suit = abc;
        if(value!=13){
            if (value==15 || value== 6 || value==-1){
            value = 5;
            suit = CLUB;
            return false;
            }
            return true;
        } else {
            return false;
        }
    }
    //getValue() method
    public String getValue() {
        if (value > 1 && value < 11) {
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
            return "" +this.value;
        }
    //getSuit() method
    public char getSuit(){
        return suit;
    }
    //toString() method
    public String toString(){
        return this.getValue() + " " + this.suit;
    }
    //equals() method
    public boolean equals(Card otherCard) {
        if((value == otherCard.value) && (suit == otherCard.suit)){
            return true;
        } else {
            return false;
        }
    }
    /** isValidValue() and isValidSuit() are private methods, they can't be used in CardTester */
    //isValidValue() method
    private boolean isValidValue(int value){
        this.value = value;
        if(value>=1 && value<=13){
            return true;
        } else {
            return false;
        }
    }
    //isValidSuit() method
    private boolean isValidSuit(char suit){
        this.suit = suit;
        if(suit==HEART||suit==DIAMOND||suit==CLUB||suit==SPADE){
            return true;
        } else {
            return false;
        }
    }
    /** This DrawCard() method is used in part 1 of the assignment*/
   // drawCard() method
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
