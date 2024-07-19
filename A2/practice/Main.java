package A2.practice;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        dealer.printCards();
    }
}
