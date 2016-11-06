import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class HandTest {

  Deck deck;
  Hand hand;
  Card aceOfClubs;
  Card kingOfSpades;

  @Before 
  public void before(){
    deck = new Deck();
    hand = new Hand();
    aceOfClubs = new Card(RankType.ACE, SuitType.CLUBS);
    kingOfSpades = new Card(RankType.KING, SuitType.SPADES);
    hand.addCard(aceOfClubs);
    hand.addCard(kingOfSpades);
  }

  @Test
  public void handCanTakeCards() {
    assertEquals(2, hand.getHand().size());
    assertEquals(aceOfClubs, hand.getHand().get(0));
    assertEquals(kingOfSpades, hand.getHand().get(1));
  }

  @Test
    public void canRestoreCard(){
      hand.addCard(aceOfClubs);
      Card card = hand.returnCard();
      Card original = (Card) card;
      assertEquals("ace of clubs", original.nameAsString());
    }

    @Test
      public void canRestoreHand(){
        hand.addCard(aceOfClubs);
        hand.addCard(kingOfSpades);
        Card card1 = hand.returnCard();
        Card original1 = (Card) card1;
        Card card2 = hand.returnCard();
        Card original2 = (Card) card2;
        assertEquals("king of spades", original1.nameAsString());
        assertEquals("ace of clubs", original2.nameAsString());
      }

}
