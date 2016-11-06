import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Player player1;
  Card aceOfClubs;
  Card kingOfSpades;
  Card kingOfHearts;
  Hand hand;

  @Before 
  public void before(){
    player1 = new Player("Hulk Hogan", new Hand());
    aceOfClubs = new Card(RankType.ACE, SuitType.CLUBS, 11);
    kingOfSpades = new Card(RankType.KING, SuitType.SPADES, 10);
    kingOfHearts = new Card(RankType.KING, SuitType.HEARTS, 10);
  }

  @Test
  public void playerHasName() {
    assertEquals("Hulk Hogan", player1.getName());
  }

  @Test
  public void canAddCard() {
    player1.addCard(aceOfClubs);
    assertEquals(1, player1.getHand().size());
  }

  @Test
  public void canMakeHand() {
    player1.makeHand(aceOfClubs, kingOfSpades);
    assertEquals(2, player1.getHand().size());
  }

  @Test
  public void canAddCardsToHand() {
    player1.makeHand(aceOfClubs, kingOfSpades);
    player1.addCard(kingOfHearts);
    assertEquals(3, player1.getHand().size());

  }

}