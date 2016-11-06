import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PontoonTest {

  Pontoon pontoon;
  Player player1;
  Player player2;
  Deck deck;

  @Before
  public void before(){
    pontoon = new Pontoon();
    deck = new Deck();
    player1 = new Player("Hulk Hogan", new Hand());
    player2 = new Player("Ultimate Warrior", new Hand());
  }

  @Test
  public void hasPlayers() {
    pontoon.addPlayer(player1);
    pontoon.addPlayer(player2);
    assertEquals(2, pontoon.playerCount());
  }

  @Test
    public void canRestorePlayer(){
      pontoon.addPlayer(player1);
      Player player = pontoon.returnPlayer();
      Player original = (Player) player;
      assertEquals("Hulk Hogan", original.getName());
    }

    // @Test
    // public void dealsCards(){
    //   pontoon.addPlayer(player1);
    //   pontoon.addPlayer(player2);
    //   pontoon.deal();
    //   assertEquals(2, player1.getHand());
    //   assertEquals(2, player2.getHand());
    // }

}