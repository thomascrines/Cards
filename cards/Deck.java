package cards;
import cards.*;
import java.util.*;

public class Deck {

  private static ArrayList<Card> deck = new ArrayList<Card>();

  public void buildDeck(){
    for (RankType rank : RankType.values()) {
      for(SuitType suit : SuitType.values()) {
        deck.add(new Card(rank, suit));
      }
    }
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }

  public void shuffle(){
    Collections.shuffle(deck);
  }

}