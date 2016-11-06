package cards;
import cards.*;
import java.util.*;

public class Player {

  private String name;
  private static ArrayList<Card> hand = new ArrayList<Card>();

  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public void addCard(Card card1) {
    this.hand.add(card1);
  }

  public void makeHand(Card card1, Card card2) {
    this.hand.add(card1);
    this.hand.add(card2);
  }

  public ArrayList getHand() {
    return this.hand;
  }

}