public class Main {
    /*Create a MainClass that creates a deck, it shuffles the deck, prints the whole deck, and
    extracts and prints 2 cards.
     */

    public static void main(String[] args) {
        Deck deck = new Deck(Main.createCards());
        Card[] cardsShuffle = deck.suffle(deck.getCards());
        Card selectedCard = deck.extractCard(cardsShuffle);
        System.out.printf(selectedCard.toString());
    }
    public static Card[] createCards() {
        Card[] orosCards = createElements(Card.OROS);
        Card[] copasCards = createElements(Card.COPAS);
        Card[] espadasCards = createElements(Card.ESPADAS);
        Card[] bastosCards = createElements(Card.BASTOS);
        Card[] cardsCreated = new Card[Card.TOTAL_CARDS];
        int counter = 0;
        for (int cardIndex = 0; cardIndex < Card.CARD_MAX; cardIndex++) {
            cardsCreated[cardIndex] = orosCards[cardIndex];
        }
        counter = 12;
        for (int cardIndex = 0; cardIndex < Card.CARD_MAX; cardIndex++) {
            cardsCreated[cardIndex + counter] = copasCards[cardIndex];
        }
        counter = 24;
        for (int cardIndex = 0; cardIndex < Card.CARD_MAX; cardIndex++) {
            cardsCreated[cardIndex + counter] = espadasCards[cardIndex];
        }
        counter = 36;
        for (int cardIndex = 0; cardIndex < Card.CARD_MAX; cardIndex++) {
            cardsCreated[cardIndex + counter] = bastosCards[cardIndex];
        }
        return cardsCreated;
    }

    public static Card[] createElements(int typePalo) {
        Card[] cards = new Card[Card.CARD_MAX];
        for (int cardIndex = 0; cardIndex < Card.CARD_MAX; cardIndex++) {
            int cardNumber = cardIndex + 1;
            cards[cardIndex] = new Card(cardNumber, typePalo);
        }
        return cards;
    }
}
