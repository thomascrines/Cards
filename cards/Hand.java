package cards;
import cards.*;
import java.util.*;

public class Hand {

  private static ArrayList<Card> hand = new ArrayList<Card>();

  public void addCard(Card card) {
    this.hand.add(card);
  }

  public ArrayList getHand() {
    return this.hand;
  }

  public int cardCount(){
    return hand.size();
  }

  public Card returnCard() {
    if(cardCount() > 0) {
      return hand.remove(0);
    }
    return null;
  }

  public int returnCardValue() {
      Card card = hand.remove(0);
      Card original = (Card) card;
      return original.returnValue();
    }


}