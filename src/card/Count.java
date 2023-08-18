package card;

public class Count {
    /**
     * finds who wins a round between 2 players
     * @param hole1 hole of player 1
     * @param hole2 hole of player 2
     * @param communityCards an array of the community cards, must be 5
     * @return value of operation 1 if hand 1 is bigger, 0 if tie, -1 if hand 2 is bigger
     * @throws Exception if the community cards is different than 5
     */
    public int findWinner(Hole hole1, Hole hole2, Card[] communityCards) throws ImproperHandSizeException{
        if (communityCards.length != 5)
            throw new ImproperHandSizeException();
        return 0;
    }

    /**
     * finds which hand has a higher score
     * @param hand1 hand of the first player
     * @param hand2 hand of the second player
     * @return 1 if player 1 wins, 0 if a tie, -1 if player 2 wins
     * @throws ImproperHandSizeException throws exception if hands are not 5 cards
     */
    public int compareHands(Card[] hand1, Card[] hand2) throws ImproperHandSizeException{
        if (hand1.length !=5 || hand2.length !=5)
            throw new ImproperHandSizeException();
        return 0;
    }

    public int
}
