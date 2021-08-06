/** This is the Card class for part 1 of the final project*/
public class Card {
    //Instance variables
    private int value;
    private char suit;
    //No-arg Constructor
    public Card(){
    }
    //Specified Constructor
    public Card(int value, char suit){
        this.value = value;
        this.suit = suit;
    }
    //SetAll method
    public void setAll(int x, char abc) {
        value = x;
        suit = abc;
    }
    //getValue() method
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
    //getSuit() method
    public char getSuit(){

        return suit;
    }
    //ToString method
    public String toString(){

        return getValue() + " " + suit;
    }
   // DrawCard method
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
