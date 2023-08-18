package gui;

import javax.swing.*;
import card.*;

import java.awt.*;

public class CardComponent extends JComponent {
    private Card card;
    public CardComponent(Card c){
        card = c;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(card.getImage(), 0, 0, 140, 250, this);
    }
}
