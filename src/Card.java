import java.security.PublicKey;

public class Card {
    public static final int ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6, SEVEN = 7, EIGHT = 8, NINE = 9, SOTA = 10, CABALLO = 11, REY = 12;

    public static final int CARD_MAX = 12;
    public static final int OROS = 1, COPAS = 2, ESPADAS = 3, BASTOS = 4;
    public static final int TOTAL_CARDS = 48;

    /* Create a class Card that represents a card of a Spanish deck [Carta de
    una baraja española]. You will have to store the number (1 to 12) and
    the suit [palo]. The suit will be a number between 1 and 4. You will
    create these public constants OROS=1, COPAS=2, ESPADAS=3,
    BASTOS=4 for the suit. The constructor will accept 2 parameters (the number and the suit).
    */
    private int cardNumber;
    private int palo;
    public Card(int cardNumber, int palo) {
        this.cardNumber = cardNumber;
        this.palo = palo;
    }


   /* Create the method toString that returns the card (number and suit), for example: “6 de espadas”.  
    Note: 10 = sota, 11 = caballo, 12 = rey
    */
    @Override
    public String toString() {
        return evaluateResponse(cardNumber) + "de " + evaluateResponse_(palo);
    }

    private String evaluateResponse(int cardNumber) {
        if (cardNumber == SOTA) {
            return "sota ";
        }
        if (cardNumber == CABALLO) {
            return "caballo ";
        }
        if (cardNumber == REY) {
            return "rey ";
        }
        return cardNumber + " ";
    }

    private String evaluateResponse_(int palo) {
        if (palo == 1) {
            return "oros";
        } if (palo == 2) {
            return "copas";
        } if (palo == 3) {
            return "espadas";
        } if (palo == 4) {
            return "bastos";
        }
        return palo + " ";
    }
}
