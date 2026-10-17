/**
 * Một lá bài, bất biến (immutable), gồm hạng (Rank) và chất (Suit).
 */
public final class Card {
    private final Rank aRank;
    private final Suit aSuit;

    public Card(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    public Rank getRank() {
        return aRank;
    }

    public Suit getSuit() {
        return aSuit;
    }

    @Override
    public String toString() {
        return aRank + " of " + aSuit;
    }
}
