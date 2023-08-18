package card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Card {
    private final Rank rank;
    private final Suit suit;
    private BufferedImage image;
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        try {
            this.image = ImageIO.read(getClass().getResource("/resources/" + rank.toChar() + suit.name().charAt(0) + ".png"));
        }
        catch (IOException e){}
    }
    @Override
    public String toString(){
        return ""+ rank.toChar() + suit.name().charAt(0);
    }
    public BufferedImage getImage(){
        return image;
    }


}
