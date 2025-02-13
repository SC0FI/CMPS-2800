package HOption;

public class Card {
    private String rank;
    private String suit;
    private int value;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        this.value = determineValue(rank);
    }

    private int determineValue(String rank) {
        switch (rank) {
            case "Ace":
                return 11; // Will adjust later if needed
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                return Integer.parseInt(rank);
        }
    }

    public int getValue() {
        return value;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

