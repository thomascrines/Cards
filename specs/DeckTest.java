import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {

  Deck deck;
  Card aceOfClubs;
  Card kingOfSpades;

  @Before 
  public void before(){
    deck = new Deck();
    aceOfClubs = new Card(RankType.ACE, SuitType.CLUBS, 11);
    kingOfSpades = new Card(RankType.KING, SuitType.SPADES, 10);
  }

  @Test
  public void hasDeckOf52(){
    deck.buildDeck();
    assertEquals(52, deck.getDeck().size());
  }

  @Test
  public void firstCardAceOfClubs() {
    deck.buildDeck();
    assertEquals(aceOfClubs.getRank(), deck.getDeck().get(0).getRank());
    assertEquals(aceOfClubs.getSuit(), deck.getDeck().get(0).getSuit());
  }

  @Test
  public void lastCardKingofSpades() {
    deck.buildDeck();
    assertEquals(kingOfSpades.getRank(), deck.getDeck().get(51).getRank());
    assertEquals(kingOfSpades.getSuit(), deck.getDeck().get(51).getSuit());
  }

}