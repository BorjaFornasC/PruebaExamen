public class Deck {
    private Card[] cards;
    /*Create the class Deck [baraja]. It will store all the cards of a deck.
    Create the class and a constructor that will create all the Cards of the
            deck.
     */
    public Deck(Card[] cards) {
        this.cards = cards;
    }
    /*In Deck, define a method shuffle [barajar] that will randomly change te
    order of the cards. You have to implement your own algorithm. Do not
    use Array.sort() or similar

     */
    public Card[] suffle(Card[] cards) {
        Card[] cards_ = new Card[Card.TOTAL_CARDS];
        for (int i = 0; i < cards_.length; i++) {
            int cardNumberIndex = ((int)(Math.random() * Card.TOTAL_CARDS + 1)) - 1;
            Card newCard = cards[cardNumberIndex];
            cards[cardNumberIndex] = new Card(0,0);
            cards_[i] = newCard;
        }
        return cards;
    }
    /*In the class Deck, declare a method extractCard that returns a card, in
            such a way that consecutive calls to the method can’t return the same card
            (as if the card had been removed from the deck). There is no need for it to be random.
            It can simply be the last card of the deck. (1.5 points)
     */
    public Card extractCard (Card[] cards) {
        Card card = cards[0];
        cards[0] = new Card(0,0);
        return card;
    }

    /* In the class Deck create the method toString that returns the whole remaining cards of
            the deck as a Sting, in this order: first all the OROS cards, then COPAS, ESPADAS and
    BASTOS. One line for each suit (no need to sort the cards):
    Example:
            6 de oros, 4 de oros, rey de oros, ……
    sota de copas, 4 de copas, 7 de copas, …
            3 de espadas, caballo de espadas, 6 de espadas, …
            8 de bastos, 5 de bastos, …
     */
    @Override
    public String toString() {
        return null;
    }


    public Card[] getCards() {
        return this.cards;
    }
}
