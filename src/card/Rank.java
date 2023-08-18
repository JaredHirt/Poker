package card;

public enum Rank {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;
    public char toChar(){
        if (ordinal() < 9)
            return Integer.toString(ordinal() + 2).charAt(0);
        else return name().charAt(0);
    }
}
