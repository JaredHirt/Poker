import card.*;
import gui.CardComponent;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(
            ()-> startGUI()
    );
    }

    public static void startGUI(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
        Card c = new Card(Rank.Four, Suit.Clubs);
        CardComponent cc = new CardComponent(c);
        frame.add(cc);

    }
}