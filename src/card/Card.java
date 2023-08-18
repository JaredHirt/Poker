package card;

import javax.swing.*;

public class Card {
    private Rank rank;
    private Suit suit;
    private Icon icon;
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    @Override
    public String toString(){
        return ""+ rank.toChar() + suit.name().charAt(0);
    }


}
