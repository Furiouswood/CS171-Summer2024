package A2.practice;

import java.util.ArrayList;

public class Player {
    public String name;
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Card play() {
        // return the top cards
        Card card = new Card(1, 1);
        return card;
    }
}
