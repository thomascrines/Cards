import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card1;
  Card card2;
  
  @Before 
  public void before(){
    card1 = new Card(RankType.ACE, SuitType.SPADES, 11);
    card2 = new Card(RankType.KING, SuitType.SPADES, 10);
  }

  @Test
  public void testCanGetRank(){
    assertEquals(RankType.ACE, card1.getRank());
  }

  @Test
  public void testCanGetSuit(){
    assertEquals(SuitType.SPADES, card1.getSuit());
  }

  @Test
  public void testCardNameAsString() {
    assertEquals("ace of spades", card1.nameAsString());
  }

  // @Test
  // public void cardReturnsValue() {
  //   assertEquals(1, card2.returnValue());
  // }

}