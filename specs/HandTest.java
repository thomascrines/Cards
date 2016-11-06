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
    aceOfClubs = new Card(RankType.ACE, SuitType.CLUBS, 11);
    kingOfSpades = new Card(RankType.KING, SuitType.SPADES, 10);
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
      Card card = hand.returnCard();
      Card original = (Card) card;
      assertEquals("ace of clubs", original.nameAsString());
    }

    @Test
      public void canRestoreHand(){
        Card card1 = hand.returnCard();
        Card original1 = (Card) card1;
        Card card2 = hand.returnCard();
        Card original2 = (Card) card2;
        assertEquals("king of spades", original1.nameAsString());
        assertEquals("ace of clubs", original2.nameAsString());
      }

      // @Test
      // public void canReturnCardValue() {
      //   assertEquals(11, hand.returnCardValue());
      // }

}
