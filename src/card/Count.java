package card;

public class Count {
    /**
     *
     * @param hole1 hole of player 1
     * @param hole2 hole of player 2
     * @param communityCards an array of the community cards, must be 5
     * @return value of operation 1 if hand 1 is bigger, 0 if tie, -1 if hand 2 is bigger
     * @throws Exception if the community cards is different than 5
     */
    public int compareHands(Hole hole1, Hole hole2, Card[] communityCards) throws Exception{
        if (communityCards.length != 5)
            throw new Exception("Improper Community Cards Length");
        return 0;
    }
}
